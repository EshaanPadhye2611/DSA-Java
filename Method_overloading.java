import java.util.*;
public class Method_overloading {

    public static void main(String[] args) {
       area(0, 0);
       area(0, 0);
        
    }
    static void area(float a,float b){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base: ");
        float base = sc.nextFloat();
        System.out.println("Enter the height : ");
        float height = sc.nextFloat();
        double area = 0.5 * (base*height);
        System.out.println(area);

    }
    static void area(int x,int y){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int length = sc.nextInt();
        System.out.println("Enter the breadth : ");
        int breadth = sc.nextInt();
        int area = length * breadth;
        System.out.println(area);
    
}
}
