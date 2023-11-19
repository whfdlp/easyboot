package whf.easy.boot.service.event;

public class EventSourceForTest2 implements EventSource {
    @Override
    public Event fireEvent() {

        Event event = new EventForTest2();
        System.out.println(getClass().getSimpleName() + " \t fireEvent " + event.getName());

        return event;
    }
}