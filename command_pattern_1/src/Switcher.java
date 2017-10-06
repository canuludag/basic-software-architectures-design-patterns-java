import java.util.ArrayList;
import java.util.List;

// Invoker
public class Switcher {

    public List<Command> mCommands;

    public Switcher() {
        mCommands = new ArrayList<>();
    }

    public void addCommand(Command command) {
        mCommands.add(command);
    }

    public void executeCommands() {
        for (Command command : mCommands)
            command.execute();
    }
}
