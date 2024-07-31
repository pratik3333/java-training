package Emp.com.org;

import java.util.Comparator;

public class FindById implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Module m1=(Module)o1;
		Module m2=(Module)o2;
		
		if(m1.getId()>m2.getId())
		{
			return 1;
		}
		else if(m1.getId()<m2.getId())
		{
			return -1;
		}
		else if(m1.getId()==m2.getId())
		{
		return m1.getName().compareTo(m2.getName());
		}
		else
		{
			retrun 0;
		}
	}

}
