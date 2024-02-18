import java.util.*;
public class Demo {
    
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        
        int arr[]=new int[3];

        System.out.println("Enter array values");
        for(int i=0; i<arr.length; i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("Display arr values");
        for (int i = 0; i < arr.length; i++) {
            
            System.out.println(arr[i]);
        }

    }
}
