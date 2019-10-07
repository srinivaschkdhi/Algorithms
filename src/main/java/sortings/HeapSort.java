package sortings;

public class HeapSort {

    public void sort(int[] arr) {
        buildHeap(arr);
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            swap(arr, i, 0);    // move current to root
            heapify(arr, i, 0);  // call maxheapify  on reduced heap
        }
    }

    private void buildHeap(int[] arr) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
    }

    private void heapify(int[] arr, int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && arr[l] > arr[largest])
            largest = l;

        if (r < n && arr[r] > arr[largest])
            largest = r;

        if (largest != i) {
            swap(arr, largest, i);
            heapify(arr,n,largest);
        }
    }

    private void swap(int[] arr, int i, int i2) {
        int temp = arr[i2];
        arr[i2] = arr[i];
        arr[i] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {10000, 11, 0, 5, 6, 10};
        HeapSort heapSort = new HeapSort();
        heapSort.sort(arr);
        new PrintArray().printArray(arr);
    }
}
