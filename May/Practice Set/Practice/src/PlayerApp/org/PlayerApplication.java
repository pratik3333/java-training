package PlayerApp.org;
import java.util.*;


public class PlayerApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		
		PlayerHelper ph=new PlayerHelper();
		
		
		
		do
		{
		
			System.out.println("Enter 1 for add player");
			System.out.println("Enter 2 for view all Player");
			System.out.println("Enter 3 for after age sorting player");
			
			System.out.println("Enter choice");
			int choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("How many player you want to add");
				int num=sc.nextInt();
				sc.nextLine();

				for(int i=0; i<num; i++)
				{
					PlayerModule pm=new PlayerModule();
					System.out.println("Enter name id age and run");
					
					String n=sc.nextLine();
//					sc.nextLine();
					int d=sc.nextInt();
					int a=sc.nextInt();
					int r=sc.nextInt();
					sc.nextLine();
					
					pm.setName(n);
					pm.setId(d);
					pm.setAge(a);
					pm.setRun(r);
					
					ph.addPlayer(pm);
				}
				break;
			case 2:
				
				ph.viewPlayer();
				break;
			case 3:
				ph.viewSorted();
				break;
				default:
					System.out.println("Wrong input");
			}
			
		
		}
		while(true);

	}

}
