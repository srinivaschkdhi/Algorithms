package sortings;

public class ImprovedBubbleSort {
    public void sort(int[] arr) {
        int n = arr.length;
        boolean swapped = true;
        for (int i = 0; i < n - 1 && swapped; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

        }
    }

    public static void main(String[] args) {
        ImprovedBubbleSort improvedBubbleSort = new ImprovedBubbleSort();
        int arr[] = {64, 25, 12, 22, 11};
        improvedBubbleSort.sort(arr);
        new PrintArray().printArray(arr);
    }
}
