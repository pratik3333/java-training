package Player.org;
import java.util.*;

public class Repository {
	
	ArrayList al=new ArrayList();
	
	public void addPlayer(Module player)
	{
		al.add(player);
	}
	
	public void viewPlayer()
	{
		for(Object obj:al)
		{
			Module p=(Module)obj;
			
			System.out.println(p.getId()+"\t"+p.getName()+"\t"+p.getRun());
			
		}
	}
	
	public void sortById()
	{
		SortById sid=new SortById();
		Collections.sort(al, sid);
		
		for(Object obj:al)
		{
			Module p=(Module)obj;
			
			System.out.println(p.getId()+"\t"+p.getName()+"\t"+p.getRun());
			
		}
	}
	
	public void sortByRun()
	{
		SortByRun srun=new SortByRun();
		Collections.sort(al, srun);
		for(Object obj:al)
		{
			Module p=(Module)obj;
			
			System.out.println(p.getId()+"\t"+p.getName()+"\t"+p.getRun());
			
		}
	}


}
