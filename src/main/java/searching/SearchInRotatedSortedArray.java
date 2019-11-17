

package searching;


public class SearchInRotatedSortedArray {
    public int search(int[] A, int target) {
        if (A == null || A.length == 0) {
            return -1;
        }

        int low = 0;
        int high = A.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (A[mid] > A[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        int start = low;
        int left = 0;
        int right = A.length - 1;

        if (target >= A[start] && target <= A[high]) {
            left = start;
        } else {
            right = start;
        }


        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (A[mid] == target) {
                return mid;
            } else if (target < A[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }
}
