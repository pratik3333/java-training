import java.util.*;
class Duck
{  
    public static void main(String [] x)
           {
              System.out.println("Enter number");
              Scanner sc = new Scanner(System.in);
              int no =sc.nextInt();
              int rem,flag=0;
              while(no!=0)
                  {
                    rem=no%10;
                    no=no/10;
                    if(rem==0)
                      {
                         flag=1;
                         break;
                      }
                   }
                   if(flag==1)
                     {
                        System.out.println("Number is a Duck number");
                     }
                     else
                     {
                        System.out.println("Number is not Duck number");
                     }
           }
}