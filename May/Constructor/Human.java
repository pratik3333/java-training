import java.util.*;

class HumanRecord
{
    private int age;
    private String name;

    HumanRecord()
    {
        System.out.println("I am in Constructor");
    }

    public void setName(String name)
    {
        this.name=name;
    }

    public String getName()
    {
        return name;
    }

    public void setAge(int age)
    {
        this.age=age;
    }
    public int getAge()
    {
        return age;
    }

}

/**
 * InnerHuman
 */
 class InnerHuman {

    private HumanRecord humanre;

    public void setHuman(HumanRecord humanre)
    {
        this.humanre=humanre;
    }

    public void showHuman()
    {
        System.out.print("Human name is " + humanre.getName() + " and age is " + humanre.getAge());
    }
}
public class Human {
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        HumanRecord hr=new HumanRecord();
        InnerHuman ih=new InnerHuman();
        int age;
        String name;

        System.out.println("Enter name and age");
        name=sc.nextLine();
        age=sc.nextInt();

        hr.setName(name);
        hr.setAge(age);
        ih.setHuman(hr);
        ih.showHuman();

    }
}
