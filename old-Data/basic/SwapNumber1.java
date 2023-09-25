public class SwapNumber1 {
    
    public static void main(String x[])
    {
        int a=10,b=20;

        System.out.printf("Before swapping a= %d\n",a);
        System.out.printf("Before swapping b= %d\n",b);

        int t;
        t=a;
        a=b;
        b=t;

        System.out.printf("after swapping a= %d\n ",a);
        System.out.printf("after swapping b= %d\n ",b);
        
    }
}
