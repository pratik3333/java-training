import java.util.*;
public class AscendingArr {
    
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

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length-1; j++) {
                
                if (arr[i]>arr[j]) {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        System.out.println("After putting in ascending order");
        for (int i = 0; i < arr.length; i++) {
            
            System.out.println(arr[i]);
        }
    }
}
