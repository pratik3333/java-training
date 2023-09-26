import java.util.Scanner;
class Table
{  
     public static void main(String [] x)
       {
           System.out.println("Enter number");

           Scanner sc = new Scanner(System.in);
           
           int no=sc.nextInt();
           System.out.println();
           for(int i=1; i<11; i++)
               {
                 System.out.println(i*no);
               }
       }
}