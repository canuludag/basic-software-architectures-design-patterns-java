public class App {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bus = new Bus();
        Vehicle bicyle = new BicycleAdapter(new Bicycle());

        car.accelerate();
        bus.accelerate();
        bicyle.accelerate();
    }
}
