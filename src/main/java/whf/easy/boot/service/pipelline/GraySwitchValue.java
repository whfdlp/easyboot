package whf.easy.boot.service.pipelline;

/**
 * @ClassName GraySwitchValue
 * @Description TODO
 * @Author whf
 * @Date 2023/11/17 14:00
 * @Version 1.0
 */
public class GraySwitchValue extends AbstractPipelineValue {

    @Override
    public boolean doExec(PipelineContext pipelineContext) {

        pipelineContext.set(PipelineContext.FOR_TEST, true);

        return true;
    }

}
