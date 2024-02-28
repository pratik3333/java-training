import java.util.*;

public class CompareString {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two name");
        String a=sc.next();
        String b=sc.next();

        int flag=1;
        
        if (a.length()==b.length()) {
            for (int i = 0; i < a.length(); i++) {
                for (int j = i; j == i; j++) {
                    if (a.charAt(i)==b.charAt(j)) {
                        flag=1;

                    }
                    else
                    {
                        flag=0;
                        break;
                    }
                }
            }
        }
        else
        {
            flag=0;
        
        }

        if(flag==1 )
        {
            System.out.println("names are same");
        }
        else{
            System.out.println("names are not same");
            
        }
    }
}
