package whf.easy.boot.service.event;

public class EventForTest implements Event {
    @Override
    public String getName() {
        return getClass().getSimpleName();
    }
}