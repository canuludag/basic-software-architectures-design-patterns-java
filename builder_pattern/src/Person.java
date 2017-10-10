public class Person {

    private final String mName;
    private final String mEmail;
    private final String mAddress;
    private final int mAge;
    private final String mNameOfMother;

    public Person(Builder builder) {
        mName = builder.name;
        mEmail = builder.email;
        mAddress = builder.address;
        mAge = builder.age;
        mNameOfMother = builder.nameOfMother;
    }

    public static class Builder {
        private final String name;
        private final String email;
        private String address;
        private int age;
        private String nameOfMother;

        public Builder(String name, String email) {
            this.name = name;
            this.email = email;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setNameOfMother(String nameOfMother) {
            this.nameOfMother = nameOfMother;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

    @Override
    public String toString() {
        return mName+"-"+mAddress+"-"+mEmail+"-"+mAge;
    }
}
