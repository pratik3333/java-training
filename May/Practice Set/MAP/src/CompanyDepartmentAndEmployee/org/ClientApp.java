package CompanyDepartmentAndEmployee.org;
import java.util.*;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Repository rp=new Repository();
		
		
		do
		{
			System.out.println("Enter 1 for add employee");
			System.out.println("Enter 2 for view Employee");
			System.out.println("Enter choice");
			int choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				sc.nextLine();
				System.out.println("Enter department name");
				String depa=sc.next();
				
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
				rp.addDepartment(depa, emp);
				
				
				break;
			case 2:
				rp.viewDepartment();
				break;
				default:
					System.out.println("Wrong choice");
			}
			
		}
		while(true);

	}

}
