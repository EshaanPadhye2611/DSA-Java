public class MaxMin {
    public static int maxelement(int []arr){
        int max = arr[0];
        for(int i =1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }

        }
        return max;
    }

    public static int minelement(int []arr){
        int min = arr[0];
        for(int i =1;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }

        }
        return min;
    }
    public static void main(String[] args) {
        int [] arr = {3,89,45,34,2};
        System.out.println(maxelement(arr));
        System.out.println(minelement(arr));


    }
}
