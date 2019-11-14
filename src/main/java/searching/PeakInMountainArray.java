
package searching;

public class PeakInMountainArray {
    public static int peakInMountainArray(int[] A) {
        int low = 0;
        int high = A.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (A[mid] < A[mid + 1]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }

        return low;
    }

    public static void main(String[] args) {
        int[] A = {10,15,8,7,5,4};
        int i = peakInMountainArray(A);
        System.out.println(A[i]);
    }
}
