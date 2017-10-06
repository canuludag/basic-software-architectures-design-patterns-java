public class TurnOffCommand implements Command {

    private Light mLight;

    public TurnOffCommand(Light light) {
        mLight = light;
    }

    @Override
    public void execute() {
        mLight.turnOff();
    }
}
