package Demo.org;
import java.util.*;



public class EmployeeAscendingApp
{
	public static void main(String[] args)
	{
		Employee e1=new Employee("digvijay",100);
		Employee e2=new Employee("Pranit",130);
		Employee e3=new Employee("omkar",150);
		Employee e4=new Employee("shubham",100);
		Employee e5=new Employee("kunal",300);
		
		TreeSet t2=new TreeSet(new MyComparator());
		t2.add(e1);
		t2.add(e2);
		t2.add(e3);
		t2.add(e4);
		t2.add(e5);
		System.out.println(t2);
	}
}


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
//}


class MyComaprator implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
		Employee e1=(Employee)obj1;
		Employee e2=(Employee)obj2;
		
		String s1=e1.name;
		String s2=e2.name;
		return s1.compareTo(s2);
	}
}





 

