import java.util.*;
public class UserInput {
     public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your name: \n");
        String name=s.next();

        System.out.println("Enter your age: \n");
        int age=s.nextInt();

        System.out.println("Enter your Gender: \n");
        char gender=s.next().charAt(0);


        System.out.println("_______________________");

        System.out.print("Name: "+ name);
        System.out.print("\nage: "+ age);
        System.out.print("\ngender: "+ gender);
       






    }
}
