package searching;

public class MinInRotatedSortedArray {
    public int findMin(int[] A) {
        if (A.length == 0) {
            return -1;
        }
        if (A.length == 1) {
            return A[0];
        }

        int low = 0;
        int high = A.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (mid > 0 && A[mid] < A[mid - 1]) {
                return A[mid];
            } else if (A[low] <= A[mid] && A[high] < A[mid]) {//left is sorted eliminate left part
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return A[low];
    }

    public int findPivot(int[] array) {
        if (array == null || array.length == 0)
            return 0;

        // Case when array is not rotated. Then first index is the pivot
        if (array.length == 1 || array[0] < array[array.length - 1]) {
            return 0;
        }

        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (mid < array.length - 1 && array[mid] > array[mid + 1])
                return array[mid + 1];
            else if (array[low] <= array[mid]) {
                // If array[start] <= array[mid],
                // it means from start to mid, all elements are in sorted order,
                // so pivot will be in second half
                low = mid + 1;
            } else
                // else pivot lies in first half, so we find the pivot in first half
                high = mid - 1;
        }

        return 0;
    }

}
