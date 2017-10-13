public class Sugar extends BeverageDecorator {

    private Beverage mBeverage;

    public Sugar(Beverage beverage) {
        super(beverage);
        mBeverage = beverage;
    }

    @Override
    public int getCost() {
        return mBeverage.getCost() + 1;
    }

    @Override
    public String getDescription() {
        return mBeverage.getDescription() + "sugar ";
    }
}
