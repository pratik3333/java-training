package StudentVector.org;
import java.util.*;


public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		Helper hp=new Helper();
		
		
		
		
		do
		{
			System.out.println("Enter 1 for add student");
			System.out.println("Enter 2 for view student list");
			System.out.println("Enter 3 for removing student");
			System.out.println("Enter 4 for searching student by id or name");
			System.out.println("Enter 5 for Arranging list in Descending order");
			System.out.println("Enter choice");
			int choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				   
//				sc.nextLine();
				 System.out.println("Enter how many students you want to add....");
				 int numstudent=sc.nextInt();
				 
				 for(int i=0; i<numstudent; i++)
				 {
					 Module mo=new Module();
					 
					 sc.nextLine();
					 System.out.println("Enter name, id and percentage");
					 
					 String name=sc.nextLine();
					 int id=sc.nextInt();
					 Float per=sc.nextFloat();
					 
					 mo.setName(name);
					 mo.setId(id);
					 mo.setPer(per);
					 
					 hp.addStudent(mo);
					 	 
					 
				 }
				 
                   				
				break;
			case 2:
				hp.viewStudent();
				
				break;
			case 3:
				hp.removeStudent();
				break;
				
			case 4:
				hp.searchStudent();
				break;
				
			case 5:
				hp.descendingStudent();
				break;
				default:
					System.out.println("wrong choice");
			}
		}
		while(true);

	}

}
