import java.util.Arrays;

public class strip {
    public static void main(String[] args) {
        String s  = "   the    sky is    blue    " ;
       s = s.strip();
        System.out.println(s);
        String [] words = s.split(" ");
        System.out.println(Arrays.toString(words));
      
        int start = 0;
        int end  = words.length-1;
       while (start < end) {
        String temp  = words[start];
        words[start] = words[end];
        words[end] = temp;
        
        start ++;
        end --;
        
       }
       System.out.println(Arrays.toString(words));
       String result = String.join(" ", words); 
       
       result = result.replaceAll("\\s+", " ").trim();
       System.out.println(result);

        
        
    }
   
    

    
}
