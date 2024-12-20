import java.util.*;;
public class Quick_sort {
    static int partition(int[] arr,int l,int h){
      int x=arr[l];
      int i =l;
      int j = h;
    while (i<j) {
        while (i <= h && arr[i]<=x) {
            i++; 
        }
        while (arr[j]>x) {
            j--;
        }
        if(i<j){
            int t = arr[i];
            arr[i] = arr[j];
            arr[j]=t;
        }
       
    }
    arr[l] = arr[j];
    arr[j] = x;
    return j;    
    }

    static void quick_sort(int [] arr,int l ,int h){
       
        if (l<h) {
            int p = partition(arr, l, h);
            quick_sort(arr, l, p-1);
            quick_sort(arr,p+1, h);
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
    int l = 0;
    int h = arr.length-1;
   System.out.println("The Unsorted array is :");
   printArr(arr);
   System.out.println();
   quick_sort(arr,l,h);
   System.out.println("The Sorted array is :");
   printArr(arr);

}
}
