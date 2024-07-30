package Emp.com.org;
import java.util.*;

public class Repository {
	
	LinkedHashSet ls=new LinkedHashSet();
	
	public void addEmp(Module emp)
	{
	  	ls.add(emp);
	}
	
	public void viewEmp()
	{
		for(Object obj:ls)
		{
			Module n=(Module)obj;
			System.out.println(n.getId()+"\t"+n.getName());
			
		}
	}
	

}
