package EmployeeHelper.org;

import java.util.ArrayList;

public class EmployeeHelper {

	private int id;
	private String name;
	private int salary;
	private String feedback;
	
	
	
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
	public String getFeedback() {
		return feedback;
	}
	
	public void setFeedback(ArrayList all) {
		
		this.feedback = all;
	}
	
}
