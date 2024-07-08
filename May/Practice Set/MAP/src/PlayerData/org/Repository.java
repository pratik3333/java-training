package PlayerData.org;
import java.util.*;

public class Repository {

	Scanner sc=new Scanner(System.in);
	
	LinkedHashMap<Integer,Model> map=new LinkedHashMap<Integer,Model>();
	
	public void addPlayer(Integer id,Model pl)
	{
		map.put(id, pl);
	}
	
	public void viewPlayer()
	{
		Set<Map.Entry<Integer, Model>> data=map.entrySet();
		
		for(Map.Entry<Integer, Model> d:data)
		{
			int id=d.getKey();
			
			Model pl=d.getValue();
			System.out.println(id+"        "+pl);
		}
	}
	
	public void removeEmployee()
	{
		System.out.println("Enter id for remove");
		int rid=sc.nextInt();
		
		Model m=map.remove(rid);
		
		if(m!=null)
		{
			System.out.println("Player deleted succesfully...");
		}
		else
		{
			System.out.println("Wrong id...");
		}
	}
}
