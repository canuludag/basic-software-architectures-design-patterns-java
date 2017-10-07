public class NameIterator implements CustomIterator {

    private String[] mNames;
    private int mIndex;

    public NameIterator(String[] names) {
        mNames = names;
    }

    @Override
    public boolean hasNext() {
        return mIndex < mNames.length;
    }

    @Override
    public Object next() {
        if (hasNext()) {
            return mNames[mIndex++];
        }

        return null;
    }
}
