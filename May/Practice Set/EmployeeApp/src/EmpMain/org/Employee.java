package EmpMain.org;
import java.util.*;

import EmployeeData.org.Empdata;
import EmployeeHelper.org.EmployeeHelper;


public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empdata em=new Empdata();
//		EmployeeHelper emph=new EmployeeHelper();
		
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("Enter 1 for adding Employee");
			System.out.println("Enter choice");
			int choice=sc.nextInt();
			
			
			switch(choice)
			{
			case 1:
				
				
				System.out.println("Enter id and name and salary and feedback");
				int id=sc.nextInt();
//				sc.nextLine();
				
				String name=sc.nextLine();
				
				sc.nextLine();
				int salary=sc.nextInt();
//				sc.nextInt();
				
				String feedback=sc.nextLine();
				sc.nextLine();
				em.setEmp(id, name, salary, feedback);
				
				
				
				break;
				
			case 2:
				em.viewEmp(null);
				break;
				
			case 3:
				break;
				
			
			}
			
			
		}
		while(true);
		
	}

}
