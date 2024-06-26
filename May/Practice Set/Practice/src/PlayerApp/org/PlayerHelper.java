package PlayerApp.org;
import java.util.*;
public class PlayerHelper {
	
	Vector v=new Vector();
	Scanner sc=new Scanner(System.in);
	
	public void addPlayer(PlayerModule pm)
	{
		v.add(pm);
	}
	
	public void viewPlayer()
	{
		
	   Iterator i=v.iterator();
	   
	   if(v.isEmpty())
	   {
		   System.out.println("Player list is empty. Please add player");
	   }
	   else
	   {
	   while(i.hasNext())
	   {
		   
		   Object obj=i.next();
		   PlayerModule pl=(PlayerModule)obj;
		   
//		   if(pl.getAge()>35)
//		   {
//			   i.remove();
//		   }
		   
		   System.out.println(pl.getId()+"\t"+pl.getName()+"\t"+pl.getAge()+"\t"+pl.getRun());
	   }
	   }
	}
	public void viewSorted()
	{
	
		Iterator i=v.iterator();
		   
		if(v.isEmpty())
		{
			System.out.println("Please add player");
		}
		else
		{
		   while(i.hasNext())
		   {
			   
			   Object obj=i.next();
			   PlayerModule pl=(PlayerModule)obj;
			   
			   if(pl.getAge()>35)
			   {
				   i.remove();
			   }
		   }
		
		for(Object obj:v)
		{
			PlayerModule plm=(PlayerModule)obj;
			System.out.println(plm.getId()+"\t"+plm.getName()+"\t"+plm.getAge()+"\t"+plm.getRun());
		}
		}
	}
	
	public void editRun()
	{
		Iterator i=v.iterator();
		
		if(v.isEmpty())
		{
			System.out.println("Player list is Empty..");
		}
		else
		{
			boolean flag=false;
			System.out.println("Enter id for editing run");
			int erun=sc.nextInt();
			
			while(i.hasNext())
			{
				Object obj=i.next();
				PlayerModule plm=(PlayerModule)obj;
				
				if(erun==plm.getId())
				{
					System.out.println("Enter run ");
					int nrun=sc.nextInt();
					
					plm.setRun(nrun);
					break;

				}
				
			}
		}
	}

}
