import java.util.*;
public class Merge_sort {

    public static void conquer(int []arr,int n , int si ,int mid,int ei){
        int [] merge_arr = new int[ei - si + 1];
        int idx1 = si;
        int idx2= mid + 1;
        int x = 0;
        while (idx1<=mid && idx2<=ei) {
            if(arr[idx1]<arr[idx2]){
                merge_arr[x++] = arr[idx1++];
            }
            else{
                merge_arr[x++] = arr[idx2++];
            }
            
        }
        while (idx1<=mid) {
            merge_arr[x++] = arr[idx1++];
        }
        while (idx2<=ei) {
            merge_arr[x++] = arr[idx2++];
        }
        for(int i = 0, j = si;i<merge_arr.length;i++,j++){
            arr[j] = merge_arr[i];
        }
    }

    public static void partition(int [] arr,int si,int ei,int n){
        if(si>=ei){
            return ;
        }
        int mid = si +(ei -si) / 2;
        partition(arr, si, mid,n);
        partition(arr, mid+1, ei, n);
        conquer(arr,n,si,mid,ei);
        

       
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
    System.out.println("The Unsorted Array is :");
    printArr(arr);
    System.out.println();
    int si=0;
    int ei = arr.length-1;

    partition( arr,si, ei, n);
    System.out.println("The Sorted Array is : ");
    printArr(arr);

    }
    
}
