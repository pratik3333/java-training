// 5.WAP program create the class name as Sum with a following methods 
// class Sum
// { void calSum(int ...x) //method with var-args
//  {//here we need to calculate the sum of all elements
//  }
// }
// public class SumApplication
// { public static void main(String x[])
//  {//here we need to create the object of Sum class and call the calSum() method and pass 
//  //parameter in it 
//  }
// }



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
