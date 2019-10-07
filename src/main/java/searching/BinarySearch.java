package searching;

public class BinarySearch {
    public int binarySearch(int[] A, int x) {
        int low = 0;
        int high = A.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A[mid])
                return mid;
            else if (x < A[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        BinarySearch binarySearch = new BinarySearch();
        int foundAt = binarySearch.binarySearch(arr, 4);
        System.out.println("Found At Index = " + foundAt);
    }
}
