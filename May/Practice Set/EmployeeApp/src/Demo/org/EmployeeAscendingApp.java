package Demo.org;
import java.util.*;

class Employee implements Comparable
{
         String name;
         int eid;
         
         Employee(String name,int id)
         {
        	 this.name=name;
        	 this.eid=eid;
         }
         
         public String toString()
         {
        	 return name+"_"+eid;
         }
         
         public int compareTo(Object obj)
         {
        	 int eid1=this.eid;
        	 Employee e=(Employee)obj;
        	 
        	 int eid2=e.eid;
        	 
        	 if(eid1<eid2)
        	 {
        		 return -1;
        	 }
        	 else if(eid1>eid2)
        	 {
        		 return 1;
        	 }
        	 else
        		 return 0;
         }
}

class CompComp
{
	public static void main(String[] args)
	{
		Employee e1=new Employee("Pratik",100);
		Employee e2=new Employee("Pranit",130);
		Employee e3=new Employee("omkar",150);
		Employee e4=new Employee("shubham",100);
		Employee e5=new Employee("kunal",300);
		
		TreeSet t=new TreeSet();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		System.out.println(t);
	}
}



 

public class EmployeeAscendingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
