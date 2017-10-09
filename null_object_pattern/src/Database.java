import java.util.ArrayList;
import java.util.List;

public class Database {

    private List<String> mCustomerNames;

    public Database() {
        mCustomerNames = new ArrayList<>();
        mCustomerNames.add("Daniel");
        mCustomerNames.add("Adam");
        mCustomerNames.add("Michael");
        mCustomerNames.add("Joe");
    }

    public boolean existCustomer(String name) {
        for (String customer : mCustomerNames) {
            if (customer.equals(name)) {
                return true;
            }
        }
        return false;
    }

}
