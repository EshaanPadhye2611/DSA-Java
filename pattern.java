import java.util.*;
public class pattern {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms : ");
        int n = sc.nextInt();
     
        for(int i =0;i<n;i++){
          
            for(int j = i;j<n;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
