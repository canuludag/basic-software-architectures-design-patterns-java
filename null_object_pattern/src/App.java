public class App {
    public static void main(String[] args) {
        CustomerFactory customerFactory = new CustomerFactory();

        System.out.println(customerFactory.getCustomer("Joe").getPerson());
        System.out.println(customerFactory.getCustomer("Joel").getPerson());
        System.out.println(customerFactory.getCustomer("Deniela").getPerson());
        System.out.println(customerFactory.getCustomer("Adam").getPerson());
    }
}
