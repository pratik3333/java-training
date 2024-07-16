package Employee.Model.Application.org;
import java.util.*;

public class Repository {

	ArrayList list=new ArrayList();
	
	
	public void addEmployee(Model emp)
	{
		list.add(emp);
	}
	
	public void viewEmployee()
	{
		for(Object obj:list)
		{
			Model m=(Model)obj;
			
			System.out.println(m.getId()+"\t"+m.getName()+"\t"+m.getSalary()+"\t"+m.getCountry());
		}
	}
	
	public void arrangeById()
	{
		SortById sid=new SortById();
		list.sort(sid);
		
		for(Object obj:list)
		{
			Model m=(Model)obj;
			
			System.out.println(m.getId()+"\t"+m.getName()+"\t"+m.getSalary()+"\t"+m.getCountry());
		}
	}
}
