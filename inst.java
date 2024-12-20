public class inst {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {4, 6, 2, 1, 3, 9};

        for(int i=1; i<arr.length; i++) {
            int j=i;
            while(j>0 && arr[j-1] > arr[j]) {
                swap(arr,j-1, j);
                j--;
            }
        }
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
    }
}
