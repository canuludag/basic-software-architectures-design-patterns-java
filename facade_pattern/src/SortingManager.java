public class SortingManager {

    private Algorithm mBubbleSort;
    private Algorithm mMergeSort;
    private Algorithm mHeapSort;

    public SortingManager() {
        mBubbleSort = new BubbleSort();
        mHeapSort = new HeapSort();
        mMergeSort = new MergeSort();
    }

    public void bubbleSort() {
        mBubbleSort.sort();
    }

    public void mergeSort() {
        mMergeSort.sort();
    }

    public void heapSort() {
        mHeapSort.sort();
    }

}
