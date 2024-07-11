package CompanyDepartmentAndEmployee.org;
import java.util.*;

public class Repository {

	LinkedHashMap<String,Model> map=new LinkedHashMap<String,Model>();
	
	public void addDepartment(String depa,Model emp)
	{
		map.put(depa, emp);
	}
	
	public void viewDepartment()
	{
		Set<Map.Entry<String, Model>> data=map.entrySet();
		
		for(Map.Entry<String, Model> d:data)
		{
			String depa=d.getKey();
			
			Model emp=d.getValue();
			
			System.out.println(depa+"         "+emp);
		}
	}
}
