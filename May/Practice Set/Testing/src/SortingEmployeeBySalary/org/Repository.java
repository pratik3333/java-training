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
		SortBySalary ssal=new SortBySalary();
		Collections.sort(al,ssal);
		
		for(Object obj:al)
		{
            Module mm=(Module)obj;
			
			System.out.println(mm.getId()+"\t"+mm.getName()+"\t"+mm.getSalary());
		}
	}
	
	public void SortById()
	{
		SortById sid=new SortById();
		Collections.sort(al, sid);
		
		for(Object obj:al)
		{
            Module mm=(Module)obj;
			
			System.out.println(mm.getId()+"\t"+mm.getName()+"\t"+mm.getSalary());
		}
	}

}
