package SortingEmployeeBySalary.org;
import java.util.*;

public class EmpClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Repository rp=new Repository();
		
		do
		{
			System.out.println("Enter 1 for add employee");
			System.out.println("Enter 2 for view Employee");
			System.out.println("Enter 3 for aarange employee by salary");
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
				
				Module emp=new Module();
				
				emp.setId(id);
				emp.setName(name);
				emp.setSalary(salary);
				
				rp.addEmployee(emp);
				
				break;
			case 2:
				rp.viewEmployee();
				break;
			case 3:
				rp.sortBySalary();
				break;
				default:
					System.out.println("Wrong Input");
			}
			
		}
		while(true);

	}

}
