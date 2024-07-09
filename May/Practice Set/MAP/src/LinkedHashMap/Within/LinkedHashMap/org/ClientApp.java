package LinkedHashMap.Within.LinkedHashMap.org;
import java.util.*;


public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Repository rp=new Repository();
		LinkedHashMap<Integer,Model> inner=new LinkedHashMap<Integer,Model>();
		
		do
		{
			System.out.println("Enter 1 for add department");
			System.out.println("Enter 2 for view Department Wise Details");
			System.out.println("Enter choice");
			int choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				    System.out.println("Enter Department");
				    String depa=sc.next();
				    
				    System.out.println("Enter id for emp");
				    int id=sc.nextInt();
				    
				    sc.nextLine();
				    System.out.println("Enter name");
				    String name=sc.nextLine();
				    
				    System.out.println("Enter salary");
				    int salary=sc.nextInt();
				    
				    Model desc=new Model();
				    desc.setName(name);
				    desc.setSalary(salary);
				    
				    
				    
				    rp.addDepartment(depa,inner);
				    
				break;
			case 2:
				break;
			case 3:
				break;
				default:
					System.out.println("Wrong input");
			}
			
		}while(true);

	}

}
