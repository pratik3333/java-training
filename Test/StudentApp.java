import java.util.*;

class Student{

    private String name;
    private int id;
    private int s1;
    private int s2;
    private int s3;
    private int s4;
    private int s5;
    private int s6;

    void setName(String name)
    {
        this.name=name;
    }
    String getName()
    {
        return name;
    }

    void setId(int id)
    {
        this.id=id;
    }
    int getId()
    {
        return id;
    }

    void setS1()
    {
        this.s1=s1;
    }
    int gets1()
    {
        return s1;
    }

    void setS2()
    {
        this.s2=s2;
    }
    int gets2()
    {
        return s2;
    }
    void setS3()
    {
        this.s3=s3;
    }
    int gets3()
    {
        return s3;
    }
    void setS4()
    {
        this.s4=s4;
    }
    int gets4()
    {
        return s4;
    }
    void setS5()
    {
        this.s5=s5;
    }
    int gets5()
    {
        return s5;
    }
    void setS6()
    {
        this.s6=s6;
    }
    int gets6()
    {
        return s6;
    }

}

class StudentRecord{
    // Student student =new Student();

    private Student student;

    // Student student[]=new Student(5);

    void setStudent()
    {
        
    }
}

public class StudentApp {

    public static void main(StringApp[] args) {
        Scanner sc=new Scanner(System.in);
        StudentRecord sr=new StudentRecord();
        Student s=new Student();

        String name;
        int id;
        int s1,s2,s3,s4,s5,s6;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the name id and 6 subjects marks");
            name=sc.nextLine();
            id=sc.nextInt();
            s1=sc.nextInt();
            s2=sc.nextInt();
            s3=sc.nextInt();
            s4=sc.nextInt();
            s5=sc.nextInt();
            s6=sc.nextInt();
        }

        
    }
    
}
