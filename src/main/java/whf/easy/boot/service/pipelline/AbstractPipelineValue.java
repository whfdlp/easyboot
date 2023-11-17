package whf.easy.boot.service.pipelline;

/**
 * @ClassName AbstractPipelineValue
 * @Description TODO
 * @Author whf
 * @Date 2023/11/17 13:59
 * @Version 1.0
 */
public abstract class AbstractPipelineValue implements PipelineValue{

    @Override
    public boolean execute(PipelineContext pipelineContext) {

        System.out.println(this.getClass().getSimpleName() + " start ");

        boolean result = doExec(pipelineContext);

        System.out.println(this.getClass().getSimpleName() + " end ");

        return result;
    }

    protected abstract boolean doExec(PipelineContext pipelineContext);
}
