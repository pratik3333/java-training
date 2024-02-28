import java.util.*;

public class Arr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int arr[][][]=new int[3][3][3];

        System.out.println("Enter array values");
        for (int i = 0; i < arr.length; i++) {
            
            for (int j = 0; j < arr.length; j++) {
                for (int j2 = 0; j2 < arr.length; j2++) {
                    arr[i][j][j2]=sc.nextInt();
                }
            }
        }

        System.out.println("Display array values");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int j2 = 0; j2 < arr.length; j2++) {
                    System.out.print(arr[i][j][j2]+" ");
                }
            }
            System.out.println();
        }

    }
}
