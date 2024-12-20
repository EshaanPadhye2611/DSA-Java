import java.util.*;

public class Selection_sort{
    public static void selection_sort(int n,int []arr){
        for(int i=0;i<n-1;i++){
            int min =i;
        for(int j=i+1;j<n;j++){
            if(arr[min]>arr[j]){
                min =j;
            }
        }
        if(min !=i){
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i]= temp;
        }
        }

    }

    public static void printArr(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms in an array = ");
        
        int n = sc.nextInt();
        int i;
        int [] arr = new int[n];
        for(i=0;i<n;i++){
            System.out.print("Enter the " +(i+1)+ " th in an array = ");
            arr[i] = sc.nextInt();
        
    }
    
   System.out.println("The Unsorted array is :");
   printArr(arr);
   selection_sort(n, arr);
   System.out.println();
   System.out.println("The Sorted Array is :");
   printArr(arr);
    }
    
}
