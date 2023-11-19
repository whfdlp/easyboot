package whf.easy.boot.service.event;

public class EventListenerForTest  implements EventListener {
    @Override
    public boolean supportEvent(Event event) {

        return event.getName().contains("Test");
    }

    @Override
    public boolean handlerEvent(Event event) {

        System.out.println(this.getClass().getSimpleName() + "\t handler " + event.getName());

        return true;
    }
}