package Employee.Application.With.FileHandling.org;
import java.io.IOException;
import java.util.*;

public class EmployeeClientApp {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Repository rp=new Repository();

		do
		{
			System.out.println("Enter 1 for add Employee");
			System.out.println("Enter 2 for view Employees");
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
				
				Model emp=new Model();
				emp.setId(id);
				emp.setName(name);
				emp.setSalary(salary);
				rp.addEmployee(emp);
				
				break;
			case 2:
				rp.viewEmployee();
				break;
			
				default:
					System.out.println("Wrong Choice....");
			}
			
		}
		while(true);
	}

}
