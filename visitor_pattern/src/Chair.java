public class Chair implements ShoppingItem {

    private double mPrice;
    private String mType;

    public Chair(double price, String type) {
        mPrice = price;
        mType = type;
    }

    public double getPrice() {
        return mPrice;
    }

    public void setPrice(double price) {
        mPrice = price;
    }

    public String getType() {
        return mType;
    }

    public void setType(String type) {
        mType = type;
    }

    @Override
    public double accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
