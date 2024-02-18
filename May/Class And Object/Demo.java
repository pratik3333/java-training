import java.util.*;

// int result;
/**
 * InnerDemo
 */
 class Add {
    int a;
    int b;
    void addition(int a, int b)
    {

        this.a=a;
        this.b=b;
        int result=a+b;

        System.out.println(result);
        
    }
    void sub(int a, int b)
    {
        this.a=a;
        this.b=b;
        int result=a-b;
        System.out.println(result);
    }
    
}

public class Demo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a;
        int b;

        

         Add ad=new Add(); 


         
        
         System.out.println("Enter Choice Which operation do you want to do.");
         int choice =sc.nextInt();
                
         System.out.println("Enter two numbers");
                a=sc.nextInt();
                b=sc.nextInt();
        
                
            
              switch (choice) {
                
                case 1:
                ad.addition(a, b);
                break;
            
                case 2:
                ad.sub(a, b);
                break;

                default:

                System.out.println("Please enter valid number");
                    break;
            }
            
        

    }
}
