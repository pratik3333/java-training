import java.util.*;

class Employee
{
	String name;
	int id;
	int basicsal;
	int sa;
	int totalsal;
	void setPersonalInfo(String name2,int id, int basicsal)
	{
		name=name2;
		this.id=id;
		this.basicsal=basicsal;
	}
	void setProgressper(int progress)
	{
		if(progress>=60)
		{
			//sa=(basicsal*30)/100;
			sa=basicsal*0.30
			totalsal=basicsal+sa;
			
		}
	}
	void show()
	{
		System.out.printf("Name is %s\n id is %d\n basic salary is %d\n total salary is %d\n",name,id,basicsal,totalsal);
	}
}

class EmployeeApp
{
public static void main(String x[])
{
	String name2;
	int id,basicsal,progress;
	Scanner sc = new Scanner(System.in);
	
	Employee emp = new Employee();
	
	System.out.println("Enter Name of Employee");
	name2=sc.nextLine();
	
	System.out.println("Enter ID of Employee");
	id=sc.nextInt();
	
	System.out.println("Enter Basic Salary Of Employee");
	basicsal=sc.nextInt();
	
	System.out.println("Enter Progress Value");
	progress=sc.nextInt();
	
	emp.setPersonalInfo(name2,id,basicsal);
	emp.setProgressper(progress);
	emp.show();
	
}	
	
}