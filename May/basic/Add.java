 class Addp {
    int a,b;
    void setValue(int x, int y)
    {
        a=x;
        b=y;
    }
    void showAdd()
    {
        System.out.println(a+b);
    }
}

public class Add {


    public static void main(String[] args) {
        
        new Addp().setValue(10,20);
        new Addp().showAdd();

        
    }
}