
class Calculater{

    public int add()
    {

        System.out.println("Hello i am add method");
        return 0;
    }
}

public class Addition {
    
    public static void main(String[] args) {
        int a=10;
        int b=11;

        Calculater cl = new Calculater();
        int result=cl.add();
        System.out.println(result);
    }
}
