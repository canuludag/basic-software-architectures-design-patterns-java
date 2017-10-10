public class App {
    public static void main(String[] args) {
        Person person1 = new Person.Builder("Can", "can@peakode.com")
                .setAge(28)
                .setAddress("Uludağ Üniversitesi Görükle Kampüsü ULUTEK No:124")
                .setNameOfMother("Mother Name")
                .build();
        System.out.println(person1);
    }
}
