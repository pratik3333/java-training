package Employee.Application.With.FileHandling.org;
import java.util.*;
import java.io.*;

public class Repository {

	public void addEmployee(Model emp) throws IOException
	{	
		FileOutputStream fops=new FileOutputStream("H:\\Java training\\May\\Practice Set\\Practice\\src\\FileHandling\\org\\NewFolder\\demo4.txt",true);
		ObjectOutputStream oout=new ObjectOutputStream(fops);
		
//		oout.writeObject(emp);
		oout.writeObject(emp);
		oout.close();
		fops.close();
		System.out.println("Employee Added Succecfully...");
		
	}
	public void viewEmployee() throws IOException, ClassNotFoundException 
	{
		FileInputStream fips=new FileInputStream("H:\\Java training\\May\\Practice Set\\Practice\\src\\FileHandling\\org\\NewFolder\\demo4.txt");
		ObjectInputStream oins=new ObjectInputStream(fips);
		
		Object obj=oins.readObject();
		if(obj!=null)
		{
			Model e=(Model)obj;
			System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSalary());
		}
	}
}
