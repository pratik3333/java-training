package SortingProgram.org;
import java.util.*;

public class Employee implements Comparable
{
	
	Scanner sc=new Scanner(System.in);
	
//	EmployeeHelper emphel=new EmployeeHelper();

	private int id;
	private String name;
	private int salary;
	
	
	
	
	public int getId() {
		return id;
	}





	public void setId(int id) {
		this.id = id;
	}






	public String getName() {
		return name;
	}






	public void setName(String name) {
		this.name = name;
	}






	public int getSalary() {
		return salary;
	}






	public void setSalary(int salary) {
		this.salary = salary;
	}






	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
	
		Employee emp=(Employee)o;
		if(this.getId()>emp.getId())
		{
			return 1;
		}
		
		else if(this.getId()<emp.getId())
		{
			return -1;
		}
		else
		{
			return 0;
		}
		}
		
	
}
	
