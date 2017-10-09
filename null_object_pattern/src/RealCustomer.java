public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String personName) {
        mPersonName = personName;
    }

    @Override
    public boolean isNull() {
        return false;
    }

    @Override
    public String getPerson() {
        return mPersonName;
    }
}
