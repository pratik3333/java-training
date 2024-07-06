package SortingEmployeeBySalary.org;
import java.util.*;

public class Module implements Comparable {

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
		
		Module emp=(Module)o;
		
		if(this.salary<emp.getSalary())
		{
			return 1;
		}
		else if(this.salary>emp.getSalary())
		{
			return -1;
		}
		else
		{
		    return 0;
		}
	}

	
}
