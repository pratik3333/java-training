package SortingProgram.org;
import java.util.*;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeHelper emphel=new EmployeeHelper();
		
		Scanner sc=new Scanner(System.in);
		
		do
		{
			
			System.out.println("Enter 1 for add Employee");
			System.out.println("Enter 2 for view Employee");
			System.out.println("Enter 3 for Sort Employee by id");
			System.out.println("Enter choice");
			int choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("Enter id");
				int id=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter name");
				String name=sc.nextLine();
				System.out.println("Enter salary");
				int salary=sc.nextInt();
				Employee emp=new Employee();
				
				emp.setId(id);
				emp.setName(name);
				emp.setSalary(salary);
				
				emphel.addEmployee(emp);
				
				
				break;
			case 2:
				emphel.viewEmployee();
				break;
			case 3:
				emphel.sortById();
				break;
				default:
					System.out.println("Wrong input");
					break;
			}
			
		}
		while(true);
	}

}
