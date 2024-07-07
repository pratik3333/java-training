package Player.org;
import java.util.Comparator;

public class SortByRun implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		
		Module p1=(Module)o1;
		Module p2=(Module)o2;
		
		if(p1.getRun()<p2.getRun())
		{
			return -1;
		}
		else if(p1.getRun()>p2.getRun())
		{
			return 1;
		}
		else
		{
		return 0;
		}
	}
	

}
