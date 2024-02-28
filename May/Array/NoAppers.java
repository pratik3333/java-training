import java.util.*;
public class NoAppers {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int arr[]=new int[5];
        System.out.println("Enter Array values");

        for (int i = 0; i < arr.length; i++) {
            
            arr[i]=sc.nextInt();
        }

        System.out.println("Display array values");
        for (int i = 0; i < arr.length; i++) {
            
            System.out.println(arr[i]);
        }

        System.out.println("Enter comparing number");
        int no=sc.nextInt();
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            
            if (no==arr[i]) {

                count++;
            }
        }
        System.out.println( no + " number appers " + count + " times.");
    }

}
