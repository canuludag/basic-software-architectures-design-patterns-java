public class InsertionSort extends Algorithm {

    private int[] mNumbers;

    public InsertionSort(int[] numbers) {
        mNumbers = numbers;
    }

    @Override
    public void initialize() {
        System.out.println("Insertion sort initializing...");
    }

    @Override
    public void sorting() {
        int temp;
        int j;

        for (int i = 1; i < mNumbers.length; i++) {
            temp = mNumbers[i];
            j = i;

            while (j > 0 && mNumbers[j - 1] > temp) {
                mNumbers[j] = mNumbers[j - 1];
                j = j - 1;
            }

            mNumbers[j] = temp;
        }
    }

    @Override
    public void printResults() {
        for (int i = 0; i < mNumbers.length; i++) {
            System.out.print(mNumbers[i] + " ");
        }
    }
}
