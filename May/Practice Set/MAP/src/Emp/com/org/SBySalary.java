package Emp.com.org;
import java.util.*;

public class SBySalary implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Module m1=(Module)o1;
		Module m2=(Module)o2;
		
		if(m1.getSalary()>m2.getSalary())
		{
			return 1;
		}
		else if(m1.getSalary()<m2.getSalary())
		{
			return -1;
		}
		else
		{
		return 0;
		}
	}

}
