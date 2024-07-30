
package Emp.com.org;
import java.util.*;

public class EmpClinetApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Repository rp=new Repository();
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("Enter 1 for add Employee");
			System.out.println("Enter 2 for view Emp id and name");
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
				
				System.out.println("Enter age");
				int age=sc.nextInt();
				
				System.out.println("enter salary");
				int salary=sc.nextInt();
				
				Module emp=new Module();
				
				emp.setId(id);
				emp.setName(name);
				emp.setAge(age);
				emp.setSalary(salary);
				
				rp.addEmp(emp);
				break;
			case 2:
				rp.viewEmp();
				break;
			case 3:
				
				break;
				default :
					System.out.println("Wrong choice");
			}
			
		}while(true);
	}

}
