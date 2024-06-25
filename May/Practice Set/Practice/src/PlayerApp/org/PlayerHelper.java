package PlayerApp.org;
import java.util.*;
public class PlayerHelper {
	
	Vector v=new Vector();
	
	public void addPlayer(PlayerModule pm)
	{
		v.add(pm);
	}
	
	public void viewPlayer()
	{
		
	   Iterator i=v.iterator();
	   
	   while(i.hasNext())
	   {
		   
		   Object obj=i.next();
		   PlayerModule pl=(PlayerModule)obj;
		   
		   if(pl.getAge()>35)
		   {
			   i.remove();
		   }
		   
		   System.out.println(pl.getId()+"\t"+pl.getName()+"\t"+pl.getAge()+"\t"+pl.getRun());
	   }
	}
	public void viewSorted()
	{
	
		Iterator i=v.iterator();
		   
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
