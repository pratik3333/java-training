import java.util.*;

public class Multi {
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int arr[][]=new int[3][3];

        System.out.println("Enter array values");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("Display array values");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
            
            System.out.printf("%d ",arr[i][j]);
            }
            System.out.println();
        }


    }
}
