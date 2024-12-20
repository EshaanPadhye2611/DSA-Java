import java.util.*;
public class variable_length {
    public static void main(String[] args) {
      array(3,4,5,7,8,9,6,3);
        
    }
    static void array(int ...v){
        System.out.println(Arrays.toString(v));
        array(v);
    }
}
