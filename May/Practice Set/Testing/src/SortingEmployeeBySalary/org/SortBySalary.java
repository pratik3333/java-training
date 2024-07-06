package SortingEmployeeBySalary.org;
import java.util.Comparator;

public class SortBySalary implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		
		Module E1=(Module)o1;
		Module E2=(Module)o2;
		
		if(E1.getSalary()<E2.getSalary())
		{
			return 1;
		}
		else if(E1.getSalary()>E2.getSalary())
		{
			return -1;
		}
		else
		{
		return 0;
		}
	}
	
}
