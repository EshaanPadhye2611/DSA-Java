import java.util.*;

public class merge_sort_2 {

    // Method to merge two subarrays in alphabetical order
    public static void conquer(String[] arr, int si, int mid, int ei) {
        String[] merged = new String[ei - si + 1];  // Array to store merged names
        int idx1 = si;      // Starting index for left subarray
        int idx2 = mid + 1; // Starting index for right subarray
        int x = 0;          // Index for the merged array

        // Merge the two subarrays in alphabetical order
        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1].compareToIgnoreCase(arr[idx2]) < 0) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }

        // Add remaining elements from the left subarray (if any)
        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }

        // Add remaining elements from the right subarray (if any)
        while (idx2 <= ei) {
            merged[x++] = arr[idx2++];
        }

        // Copy the merged array back to the original array
        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    // Method to divide the array into two halves
    public static void partition(String[] arr, int si, int ei) {
        if (si >= ei) {
            return;  // Base case: only one element left to sort
        }

        int mid = si + (ei - si) / 2;  // Find the midpoint
        partition(arr, si, mid);       // Recursively sort the left half
        partition(arr, mid + 1, ei);   // Recursively sort the right half
        conquer(arr, si, mid, ei);     // Merge the sorted halves
    }

    // Method to print the array
    public static void printArr(String[] arr) {
        for (String name : arr) {
            System.out.print(name + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of names
        System.out.print("Enter the number of names: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume the newline

        String[] names = new String[n];

        // Input names
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }

        // Print unsorted names
        System.out.println("Unsorted names:");
        printArr(names);

        // Sort the names using merge sort
        partition(names, 0, names.length - 1);

        // Print sorted names
        System.out.println("Sorted names in alphabetical order:");
        printArr(names);
    }
}
