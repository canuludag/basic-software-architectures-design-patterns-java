public class Milk extends BeverageDecorator {

    private Beverage mBeverage;

    public Milk(Beverage beverage) {
        super(beverage);
        mBeverage = beverage;
    }

    @Override
    public int getCost() {
        return mBeverage.getCost() + 3;
    }

    @Override
    public String getDescription() {
        return mBeverage.getDescription() + "milk ";
    }
}
