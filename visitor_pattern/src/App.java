import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<ShoppingItem> items = new ArrayList<>();
        items.add(new Table(22, "dinner_table"));
        items.add(new Table(3, "office_desk"));
        items.add(new Table(2, "picnic_table"));
        items.add(new Table(45, "office_chair"));
        items.add(new Table(32, "dinner_chair"));

        double sum = 0;
        ShoppingCartVisitor shoppingCart = new ShoppingCart();
        for (ShoppingItem shoppingItem : items)
            sum = sum + shoppingItem.accept(shoppingCart);

        System.out.println(sum);
    }
}
