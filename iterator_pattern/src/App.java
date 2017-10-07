public class App {
    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();

        for (CustomIterator iterator = nameRepository.getIterator(); iterator.hasNext();) {
            String name = (String) iterator.next();
            System.out.println(name);
        }
    }
}
