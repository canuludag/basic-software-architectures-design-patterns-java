public class Table implements ShoppingItem {

    private double mPrice;
    private String mString;

    public Table(double price, String string) {
        mPrice = price;
        mString = string;
    }

    public double getPrice() {
        return mPrice;
    }

    public void setPrice(double price) {
        mPrice = price;
    }

    public String getString() {
        return mString;
    }

    public void setString(String string) {
        mString = string;
    }

    @Override
    public double accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
