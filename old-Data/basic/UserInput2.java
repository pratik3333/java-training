import java.util.*;
public class UserInput2 {
    public static void main(String[] args) {

       Scanner s=new Scanner(System.in);

       System.out.println("Enter your name: ");
       String name = s.next();

       System.out.println("Enter your age: ");
       int age = s.nextInt();

       System.out.println("Enter your gender: ");
       String gender=s.next();

       System.out.println("_______________________");

       System.out.print("name : "+name);
       
       System.out.print("\nage : "+age);

       System.out.print("\ngender : "+gender);

        
    }

}
