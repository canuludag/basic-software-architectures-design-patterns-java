public class App {
    public static void main(String[] args) {
        int[] numbers = {100,5,7,-6,0};
        /*Algorithm bubbleSort = new BubbleSort(numbers);
        bubbleSort.sort();*/

        Algorithm insertionSort = new InsertionSort(numbers);
        insertionSort.sort();
    }
}
