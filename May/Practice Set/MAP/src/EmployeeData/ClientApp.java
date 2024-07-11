package EmployeeData;
import java.util.*;


public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		Repository rp=new Repository();
		
		do
		{
			
			System.out.println("Enter 1 for add Employee");
			System.out.println("Enter 2 for view Employee Details");
			System.out.println("Enter choice");
			int choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				
				System.out.println("Enter Employee ID");
				int id=sc.nextInt();
				
				sc.nextLine();
				System.out.println("Enter Employee name");
				String name=sc.nextLine();
				
				System.out.println("Enter address");
				String add=sc.nextLine();
				
				System.out.println("Enter salary of employee");
				int salary=sc.nextInt();
				
				Model emp=new Model();
				
				emp.setName(name);
				emp.setAdd(add);
				emp.setSalary(salary);
				
				rp.addEmployee(id, emp);
				
				
				break;
			case 2:
				rp.viewEmployee();
				break;
			case 3:
				break;
				default:
					System.out.println("Wrong choice");
			}
		}
		while(true);
			
	}

}
