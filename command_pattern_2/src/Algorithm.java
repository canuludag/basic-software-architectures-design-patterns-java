import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Algorithm {

    private BlockingQueue<Command> mCommandQueue;

    public Algorithm() {
        mCommandQueue = new ArrayBlockingQueue<>(10);
    }

    public void produce() {
        try {
            for (int i = 0; i < 10; i++)
                mCommandQueue.put(new TaskSolver(new Task(i + 1)));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void consume() {
        try {
            for (int i = 0; i <10 ; i++) {
                Thread.sleep(1000);
                mCommandQueue.take().execute();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
