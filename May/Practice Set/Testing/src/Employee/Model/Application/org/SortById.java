package Employee.Model.Application.org;

import java.util.Comparator;

public class SortById implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		
		Model m1=(Model)o1;
		Model m2=(Model)o2;
		
		if(m1.getId()>m2.getId())
		{
			return -1;
		}
		else if(m1.getId()<m2.getId())
		{
			return 1;
		}
		else if(m1.getId()==m2.getId())
		{
			return m1.getName().compareTo(m2.getName());
			
			
		}
		else
		{
		return 0;
		}
	}

}
