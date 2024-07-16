package Employee.Model.Application.org;
import java.util.*;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		Repository rp=new Repository();
		
		
		do
		{
			
			System.out.println("Enter 1 for add Employee");
			System.out.println("Enter 2 for view Employee List");
			System.out.println("Enter 3 for sort Employee by id");
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
				  
				  System.out.println("Enter country");
				  String country=sc.nextLine();
				  
				  System.out.println("Enter salary");
				  int salary=sc.nextInt();
				  
				  Model emp=new Model();
				  emp.setId(id);
				  emp.setName(name);
				  emp.setCountry(country);
				  emp.setSalary(salary);
				  rp.addEmployee(emp);
				  
				  
				break;
			case 2:
				rp.viewEmployee();
				break;
			case 3:
				rp.arrangeById();
				break;
				default:
					System.out.println("Wrong input");
			}
		}
		while(true);

	}

}
