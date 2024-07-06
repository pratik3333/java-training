package SortingEmployeeBySalary.org;
import java.util.*;

public class Repository {
	
	ArrayList al=new ArrayList();
	
	public void addEmployee(Module emp)
	{
		al.add(emp);
	}
	
	public void viewEmployee()
	{
		for(Object obj:al)
		{
			Module mm=(Module)obj;
			
			System.out.println(mm.getId()+"\t"+mm.getName()+"\t"+mm.getSalary());
		}
	}
	
	public void sortBySalary()
	{
		Collections.sort(al);
		
		for(Object obj:al)
		{
            Module mm=(Module)obj;
			
			System.out.println(mm.getId()+"\t"+mm.getName()+"\t"+mm.getSalary());
		}
	}

}
