import java.util.Arrays;

public class swap {

public static void reversearray(int arr[]){
    int start = 0;
    int end = arr.length-1;

    while (start<end) {
        swaparray(arr, start, end);
        start++;
        end--;
        
    }
}

    public static void swaparray(int arr[],int idx1,int idx2){
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    
    }
    public static void main(String[] args) {
        int [] arr = {3,6,8,1,9,12};
        System.out.println(Arrays.toString(arr));
        reversearray(arr);
        System.out.println(Arrays.toString(arr));


        
       
        
    }
}
