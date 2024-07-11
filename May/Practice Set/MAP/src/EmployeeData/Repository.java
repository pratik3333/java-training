package EmployeeData;
import java.util.*;


public class Repository {
	
	LinkedHashMap<Integer,Model> map=new LinkedHashMap<Integer,Model>();
	
	public void addEmployee(Integer id,Model emp)
	{
		
		map.put(id, emp);
		
	}

	
	public void viewEmployee()
	{
		Set<Map.Entry<Integer, Model>> data= map.entrySet();
		
		for(Map.Entry<Integer, Model> d:data)
		{
			int id=d.getKey();
			Model emp=d.getValue();
			
			
			System.out.println(id+ "-------"+emp);
			
			
//			System.out.println(m);
//			for(Model m:emp)
//			{
//				System.out.println(m.getName()+"\t"+m.getAdd()+"\t"+m.getSalary());
//			}
		}
	}
}
