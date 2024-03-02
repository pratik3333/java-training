import java.util.*;

public class StringApp {
    public static void main(StringApp[] args) {
        Scanner sc=new Scanner(System.in);
        // String str=new String();
        String subs;
        String str;

        System.out.println("Enter the string");
        str=sc.nextLine();

        System.out.println("Enter subString");
        subs=sc.nextLine();

        int start = 0;
        for (int j = 0; j < str.length(); j++) {
            
        
        for (int i = 0; i <= subs.length(); i++) {

            if (str.charAt(j) == subs.charAt(i)) 
            {
                if ((i - start) == 0) 
                {
                    System.out.println(str.substring(start, i));
                }
                start = i + 1;
            }
            
        }
    }

        for (int i = 0; i < subs.length(); i++) {
            
            for (int j = 0; j < str.length(); j++) {
                

                if () {
                    
                }
            }
        }

    }
}
