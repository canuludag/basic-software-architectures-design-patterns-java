public class App {
    public static void main(String args[]) {
        final Algorithm algorithm = new Algorithm();

        Thread t1 = new Thread(() -> algorithm.produce()); // Converted into Lambda version

        Thread t2 = new Thread(algorithm::consume); // Converted into method reference

        t1.start();
        t2.start();
    }
}
