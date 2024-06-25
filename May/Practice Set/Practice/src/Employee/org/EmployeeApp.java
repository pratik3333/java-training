package Employee.org;
import java.util.*;


public class EmployeeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector v=new Vector();
		
		EmployeePoJO em1=new EmployeePoJO();
		em1.setId(1);
		em1.setName("pratik");
		em1.setSalary(2300);
		
		EmployeePoJO em2=new EmployeePoJO();
		em2.setId(2);
		em2.setName("pranit");
		em2.setSalary(3400);
		
		
		EmployeePoJO em3= new EmployeePoJO();
		em3.setId(3);
		em3.setName("tanaji");
		em3.setSalary(5500);
		
		v.add(em1);
		v.add(em2);
		v.add(em3);
		
		Iterator i=v.iterator();
		
		while(i.hasNext())
		{
			Object obj=i.next();
			
			EmployeePoJO e=(EmployeePoJO)obj;
			
			
			System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSalary());
		}
		
		
		

	}

}
