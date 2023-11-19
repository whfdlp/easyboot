package whf.easy.boot.service.event;

public interface EventSource {

    /**
     * 发出事件
     *
     * @return
     */
    Event fireEvent();

}
