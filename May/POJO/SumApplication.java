import java.util.*;

class Sum{

    private int x[];
    private int s;

    void calSum(int ...x)
    {
        this.x=x;
        for (int i = 0; i < x.length; i++) {
            s=s+x[i];
        }

        System.out.println("Sum of all elements is " + s);
        
    }
}


public class SumApplication {
    public static void main(String[] args) {
     
        Scanner sc=new Scanner(System.in);
        Sum ad=new Sum();

        System.out.println("Enter the size of array");
        int size=sc.nextInt();

        int x[]=new int[size];

        System.out.println("Enter the array values");
        
        for (int i = 0; i < x.length; i++) {
            
            x[i]=sc.nextInt();
        }

        ad.calSum(x);

    }
}
