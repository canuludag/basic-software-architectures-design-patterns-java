public class Book implements BookHandler{

    private BookPersistance mBookPersistance;
    private int mNumOfPages;
    private String mAuthorName;

    public Book(int numOfPages, String authorName) {
        mNumOfPages = numOfPages;
        mAuthorName = authorName;
        mBookPersistance = new BookPersistance();
    }

    public int getNumOfPages() {
        return mNumOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        mNumOfPages = numOfPages;
    }

    public String getAuthorName() {
        return mAuthorName;
    }

    public void setAuthorName(String authorName) {
        mAuthorName = authorName;
    }

    @Override
    public String toString() {
        return mAuthorName + " - " + mNumOfPages;
    }


    @Override
    public void print() {
        System.out.println("Printing the book...");
    }

    @Override
    public void save() {
        mBookPersistance.save(this);
    }
}
