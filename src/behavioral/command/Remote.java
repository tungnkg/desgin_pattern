package behavioral.command;

public class Remote {
    private ICommand turnOn;
    private ICommand turnOff;

    public Remote(ICommand turnOn, ICommand turnOff) {
        this.turnOn = turnOn;
        this.turnOff = turnOff;
    }

    public void turnOnButtonClick(){
        turnOn.execute();
    }

    public void turnOffButtonClick(){
        turnOff.execute();
    }
}
