public class TurnOnCommand implements Command {

    private Light mLight;

    public TurnOnCommand(Light light) {
        mLight = light;
    }

    @Override
    public void execute() {
        mLight.turnOn();
    }
}
