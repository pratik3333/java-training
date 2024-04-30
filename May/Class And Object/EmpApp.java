import java.util.Scanner;


class Employee
{
	private int id;
	private int marks;
	private String name;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	
	public void setMarks(int marks)
	{
		this.marks=marks;
	}
	public int getMarks()
	{
		return marks;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
}


class EmployeeRecord
{
	private Employee employee;
	
	
	public void setEmployee(Employee employee)
	{
		this.employee=employee;
	}
	public void getEmployee()
	{
		int id=employee.getId();
		int marks=employee.getMarks();
		String name=employee.getName();
		
		System.out.printf("%s\t%d\t%d",name,id,marks);
		
	}
}


public class EmpApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		Employee employee=new Employee();
		EmployeeRecord er=new EmployeeRecord();
		
		System.out.println("Enter name id and marks");
		String name=sc.nextLine();
		int id = sc.nextInt();
		int marks = sc.nextInt();
		
		employee.setName(name);
		employee.setId(id);
		employee.setMarks(marks);
		
		er.setEmployee(employee);
		er.getEmployee();
	}
}