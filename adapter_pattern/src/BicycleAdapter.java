public class BicycleAdapter implements Vehicle {

    private Bicycle mBicycle;

    public BicycleAdapter(Bicycle bicycle) {
        mBicycle = bicycle;
    }

    @Override
    public void accelerate() {
        mBicycle.go();
    }
}
