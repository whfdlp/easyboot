package whf.easy.boot.service.pipelline;

public interface PipelineValue {

    /**
     * 节点执行
     *
     * @param pipelineContext
     * @return
     */
    boolean execute(PipelineContext pipelineContext);

}
