// Swapping Two numbers without using third variable

public class SwapNumber2 {

    public static void main(String x[])
    {
        int a=10,b=20;
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.printf("value of a= %d\n", a);
        System.out.printf("value of b= %d\n", b);
    }
    
}
