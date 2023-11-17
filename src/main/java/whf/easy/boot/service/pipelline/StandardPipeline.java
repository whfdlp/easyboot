package whf.easy.boot.service.pipelline;

import com.google.common.collect.Lists;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * @ClassName StandardPipeline
 * @Description TODO
 * @Author whf
 * @Date 2023/11/17 13:56
 * @Version 1.0
 */
public class StandardPipeline implements Pipeline{

    private static final Logger LOGGER = LoggerFactory.getLogger(StandardPipeline.class);
    private List<PipelineValue> pipelineValueList = Lists.newArrayList();

    @Override
    public boolean invoke(PipelineContext pipelineContext) {
        boolean isResult = true;
        for (PipelineValue pipelineValue : pipelineValueList) {
            try {
                isResult = pipelineValue.execute(pipelineContext);
                if (!isResult) {
                    LOGGER.error("{},exec is wrong", pipelineValue.getClass().getSimpleName());
                    System.out.println(pipelineValue.getClass().getSimpleName() + ",exec is wrong");
                }

            } catch (Exception e) {
                LOGGER.error(e.getMessage(), e);
            }
        }

        return isResult;
    }

    @Override
    public boolean addValue(PipelineValue pipelineValue) {
        if (pipelineValueList.contains(pipelineValue)) {
            return true;
        }

        return pipelineValueList.add(pipelineValue);
    }

    @Override
    public boolean removeValue(PipelineValue pipelineValue) {
        return pipelineValueList.remove(pipelineValue);
    }

}
