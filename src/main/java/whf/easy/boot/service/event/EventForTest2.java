package whf.easy.boot.service.event;

public class EventForTest2 implements Event {
    @Override
    public String getName() {
        return getClass().getSimpleName();
    }
}