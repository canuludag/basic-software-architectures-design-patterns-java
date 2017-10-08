public class BubbleSort extends Algorithm {

    private int[] mNumbers;

    public BubbleSort(int[] numbers) {
        mNumbers = numbers;
    }

    @Override
    public void initialize() {
        System.out.println("Bubble sort initializing...");
    }

    @Override
    public void sorting() {

        int n = mNumbers.length;
        int temp;

        while (n != 0) {
            temp = 0;

            for (int i = 1; i < n; i++) {
                if (mNumbers[i - 1] > mNumbers[i]) {
                    int swap = mNumbers[i - 1];
                    mNumbers[i-1] = mNumbers[i];
                    mNumbers[i] = swap;
                    temp = i;
                }
            }

            n = temp;
        }

    }

    @Override
    public void printResults() {
        for (int i = 0; i < mNumbers.length; i++) {
            System.out.print(mNumbers[i] + " ");
        }
    }
}
