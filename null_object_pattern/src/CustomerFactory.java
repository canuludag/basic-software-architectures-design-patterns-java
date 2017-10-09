public class CustomerFactory {

    private Database mDatabase;

    public CustomerFactory() {
        mDatabase = new Database();
    }

    public AbstractCustomer getCustomer(String name) {
        if (checkName(name)) {
            return new RealCustomer(name);
        }

        return new NullCustomer();
    }

    private boolean checkName(String name) {
        if(mDatabase.existCustomer(name)) {
            return true;
        }

        return false;
    }
}
