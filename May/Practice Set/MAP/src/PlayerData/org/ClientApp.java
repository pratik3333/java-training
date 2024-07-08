package PlayerData.org;
import java.util.*;
public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		Repository rp=new Repository();
		
		do
		{
			System.out.println("Enter 1 for add Player");
			System.out.println("Enter 2 for view Player");
			System.out.println("Enter 3 for remove player");
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
				System.out.println("Enter run");
				int run=sc.nextInt();
				
				Model pl=new Model();
				
				pl.setName(name);
				pl.setAge(age);
				pl.setRun(run);
				
				rp.addPlayer(id, pl);
				break;
			case 2:
				rp.viewPlayer();
				break;
			case 3:
				rp.removePlayer();
				break;
				default:
					System.out.println("Wrong input");
			}
			
		}while(true);
		
	}

}
