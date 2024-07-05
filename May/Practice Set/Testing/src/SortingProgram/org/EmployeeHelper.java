package SortingProgram.org;
import java.util.*;

public class EmployeeHelper {
	
	ArrayList al=new ArrayList();
	
	public void addEmployee(Employee emp)
	{
		al.add(emp);
	}
	
	public void viewEmployee()
	{
		for(Object obj:al)
		{
			Employee emp=(Employee)obj;
			
			System.out.println(emp.getId()+"\t"+emp.getName()+"\t"+emp.getSalary());
		}
	}
	
	public void sortById()
	{
		Collections.sort(al);
		System.out.println("After sorting");
		
		for(Object obj:al)
		{
			Employee emp=(Employee)obj;
			System.out.println(emp.getId()+"\t"+emp.getName()+"\t"+emp.getSalary());
		}
	}

}
