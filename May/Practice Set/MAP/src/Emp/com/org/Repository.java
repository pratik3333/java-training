package Emp.com.org;
import java.util.*;

public class Repository {
	
	ArrayList ls=new ArrayList();
	
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
	public void fidById()
	{
		FindById fid=new FindById();
		
		Collections.sort(ls, fid);
		
		for(Object obj:ls)
		{
			Module m=(Module)obj;
			System.out.println(m.getId()+"\t"+m.getName()+"\t"+m.getSalary());
		}
		
		
	}
	public void SortbySalary()
	{
		SBySalary sbs=new SBySalary();
		Collections.sort(ls,sbs);
		for(Object obj:ls)
		{
			Module m=(Module)obj;
			System.out.println(m.getId()+"\t"+m.getName()+"\t"+m.getSalary());
		}
		
	}
	

}
