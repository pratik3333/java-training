package Player.org;
import java.util.Comparator;

public class SortById implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		
		Module p1=(Module)o1;
		Module p2=(Module)o2;
		
		if(p1.getId()<p2.getId())
		{
			return -1;
		}
		else if(p1.getId()>p2.getId())
		{
			return 1;
		}
		else if(p1.getId()==p2.getId()) //if both id are same then go for name.
		{
			return p1.getName().compareTo((p2.getName()));  //here we comapare both students name.
		}
		else
		{
		
		return 0;
		}
	}

}
