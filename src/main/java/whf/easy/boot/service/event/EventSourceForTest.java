package whf.easy.boot.service.event;

public class EventSourceForTest implements EventSource {
    @Override
    public Event fireEvent() {

        Event event = new EventForTest();
        System.out.println(getClass().getSimpleName() + " \t fireEvent " + event.getName());

        return event;
    }
}