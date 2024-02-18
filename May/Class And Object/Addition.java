
class Calculater{

    void add(int a, int b)
    {
        // System.out.println("Hello i am add method");
        int re= a+b;;
        System.out.println("The result is " +  re);
        
    }
}

public class Addition {
    
    public static void main(String[] args) {
        int a=10;
        int b=11;
        Calculater cl = new Calculater();
        cl.add(a,b);
    }
}
