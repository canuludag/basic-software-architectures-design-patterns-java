public abstract class BeverageDecorator implements Beverage{

    private Beverage mBeverage;

    public BeverageDecorator(Beverage beverage) {
        mBeverage = beverage;
    }

    @Override
    public int getCost() {
        return mBeverage.getCost();
    }

    @Override
    public String getDescription() {
        return mBeverage.getDescription();
    }
}
