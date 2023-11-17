package whf.easy.boot.service.pipelline;

/**
 * @ClassName PipelineClient
 * @Description TODO
 * @Author whf
 * @Date 2023/11/17 14:01
 * @Version 1.0
 */
public class PipelineClient {

    public static void main(String[] args) {

        // 管道初始化
        Pipeline pipeline = new StandardPipeline();

        // value扩展
        PipelineValue pipelineValue = new GraySwitchValue();
        PipelineValue pipelineValue2 = new ForTestValue();

        // 上下文
        PipelineContext pipelineContext = new StandardPipelineContext();

        pipeline.addValue(pipelineValue);
        pipeline.addValue(pipelineValue2);

        // 调用管道
        pipeline.invoke(pipelineContext);

    }
}
