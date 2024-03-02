import java.util.*;


class Empolyee{
    private String name;
    private int id;
    private int basicSal;
    private double sal;
    private double sp;

    void setPersonalInfo(String name, int id, int basicSal)
    {
        this.name=name;
        this.id=id;
        this.basicSal=basicSal;
    }

    void setProgress(int progress)
    {
        if (progress>=60) {
            
            sp=basicSal * 0.3;
            sal=basicSal + sp;
        }
        else
        {
            sal=basicSal;
        }
    }

    void show()
    {
        System.out.print("Name is " + name + ". Id is "+ id + ". basic salary is "+basicSal+". And Total salary is "+sal +".");

    }

}

public class ProgressApp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Empolyee em=new Empolyee();

        String name;
        int id;
        int basicSal;
        int per;

        System.out.println("Enter Employee name id and basic salary");
        name=sc.nextLine();
        id=sc.nextInt();
        basicSal=sc.nextInt();

        System.out.println("Enter progress percentage");
        per=sc.nextInt();

        em.setPersonalInfo(name, id, basicSal);
        em.setProgress(per);

        em.show();

    }
    
}
