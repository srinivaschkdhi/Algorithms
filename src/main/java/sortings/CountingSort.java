package sortings;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        char[] arr = {'g','e','e','k','s','f','o','r','g','e','e','k','s'};
        CountingSort countingSort = new CountingSort();
        countingSort.sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public void sort(char[] arr){
        int n = arr.length;
        char[] output = new char[n];
        int[] count = new int[256];

        for(int i=0;i<n;i++)
            ++count[arr[i]];

        for (int i = 1; i <=255; i++) {
            count[i]+=count[i-1];
        }

        for (int i = 0; i < n; i++) {
            output[count[arr[i]]-1] = arr[i];
            --count[arr[i]];
        }

        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }
    
    public int[] sort2(int[] arr) {
        int[] output = new int[arr.length];

        int[] count = new int[256];
        for (int n : arr) {
            count[n]++;
        }

        for (int i = 1; i < 256; i++)
            count[i] += count[i - 1];

        for (int n : arr) {
            output[count[n] - 1] = n;
            count[n]--;
        }

        return output;
    }
}
