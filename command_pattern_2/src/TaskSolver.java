public class TaskSolver implements Command {

    private Task mTask;

    public TaskSolver(Task task) {
        mTask = task;
    }

    @Override
    public void execute() {
        mTask.solveProblem();
    }
}
