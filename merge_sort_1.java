import java.util.*;

public class merge_sort_1 {

    public static void conquer(int[] arr, int si, int mid, int ei) {
        int[] merge_arr = new int[ei - si + 1];
        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;

        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] < arr[idx2]) {
                merge_arr[x++] = arr[idx1++];
            } else {
                merge_arr[x++] = arr[idx2++];
            }
        }

        while (idx1 <= mid) {
            merge_arr[x++] = arr[idx1++];
        }

        while (idx2 <= ei) {
            merge_arr[x++] = arr[idx2++];
        }

        for (int i = 0, j = si; i < merge_arr.length; i++, j++) {
            arr[j] = merge_arr[i];
        }
    }

    public static void partition(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;
        partition(arr, si, mid);
        partition(arr, mid + 1, ei);
        conquer(arr, si, mid, ei);
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        int n = 100000; // Generate 1000 random values

        int[] arr = new int[n];

        // Populate array with random values between 1 and 10000
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(1000000) + 1;
        }

        System.out.println("The Unsorted Array is :");
        printArr(arr);
        System.out.println();

        int si = 0;
        int ei = arr.length - 1;

        // Call merge sort to sort the array
        partition(arr, si, ei);

        System.out.println("The Sorted Array is : ");
        printArr(arr);
    }
}
