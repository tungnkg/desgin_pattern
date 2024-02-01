package structural.proxy;

public class LazyRemote implements Remote {
    private RemoteImpl wrapper =null;
    @Override
    public void turnOn() {
        if(wrapper == null) wrapper = new RemoteImpl();
        wrapper.turnOn();
    }

    @Override
    public void turnOff() {
        if(wrapper == null) wrapper = new RemoteImpl();
        wrapper.turnOff();
    }
}
