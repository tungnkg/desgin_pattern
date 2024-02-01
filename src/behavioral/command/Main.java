package behavioral.command;

public class Main {
    public static void main(String[] args) {
        Fan fan = new Fan();
        TurnOnCommand turnOnCommand = new TurnOnCommand(fan);
        TurnOffCommand turnOffCommand = new TurnOffCommand(fan);
        Remote remote = new Remote(turnOnCommand, turnOffCommand);

        remote.turnOnButtonClick();
        remote.turnOffButtonClick();
    }
}
