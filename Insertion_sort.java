import java.util.Scanner;

public class Insertion_sort {
 void Insertion (int[] arr)
{
    int n = arr.length;
    int i;

   
    for(i=1;i<n;i++){
        int key = arr[i];
        int j=i-1;
        while (j>=0 && arr[j] > key)
         {
            arr[j+1] = arr[j];
            j=j-1;
            
            

        }
        arr[j+1] = key;   
        
        
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
    Insertion_sort sorter = new Insertion_sort();
     sorter.Insertion(arr);

     System.out.print("The Sorted array is: ");
        for (int o = 0; o < n;o++) {
            System.out.print(arr[o] + " ");

    
}
}
}
