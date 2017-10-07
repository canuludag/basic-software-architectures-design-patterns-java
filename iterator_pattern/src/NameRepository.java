public class NameRepository {
    private String[] names = { "Adam","Joe","John","Sarah" };

    public CustomIterator getIterator() {
        return new NameIterator(names);
    }
}
