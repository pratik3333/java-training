package Player.org;
import java.util.*;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Repository rp=new Repository();
		
		
		do
		{
			System.out.println("Enter 1 for add player");
			System.out.println("Enter 2 for view player");
			System.out.println("Enter 3 for sort player by id");
			System.out.println("Enter 4 for sort player by run");
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
				
				System.out.println("Enter run");
				int run=sc.nextInt();
				
				Module player=new Module();
				player.setId(id);
				player.setName(name);
				player.setRun(run);
				
				rp.addPlayer(player);
				
				
				break;
			case 2:
				rp.viewPlayer();
				break;
			case 3:
				rp.sortById();
				break;
			case 4:
				rp.sortByRun();
				break;
				default:
					System.out.println("Wrong choice");
			}
			
		}
		while(true);

	}

}
