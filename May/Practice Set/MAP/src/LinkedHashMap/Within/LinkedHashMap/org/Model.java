package LinkedHashMap.Within.LinkedHashMap.org;
import java.util.*;
public class Model {
	
	
	private String name;
	private int salary;
	
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
	public String toString() {
		// TODO Auto-generated method stub
		return "\t"+ name+"\t"+salary;
	}

	
}
