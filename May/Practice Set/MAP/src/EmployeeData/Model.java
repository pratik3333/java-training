package EmployeeData;
import java.util.*;


public class Model {

	String name;
	String add;
	int salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	

	public String toString()
	{
		return name + " "+ add +" "+salary;
		
	}
}
