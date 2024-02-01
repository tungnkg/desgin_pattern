package creational.singleton;

public class TestThread extends Thread {
    public void run() {
        Singleton.getInstance().test();
    }
}
