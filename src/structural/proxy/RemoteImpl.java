package structural.proxy;

public class RemoteImpl implements Remote {
    @Override
    public void turnOn() {
        System.out.println("Bật điều khiển");
    }

    @Override
    public void turnOff() {
        System.out.println("Tắt điều khiển");
    }
}
