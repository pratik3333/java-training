package StudentVector.org;
import java.util.*;

public class Helper {

	Module m=new Module();
	Vector v=new Vector();
	Scanner sc=new Scanner(System.in);
	
	public void addStudent(Module mo)
	{
		v.add(mo);
		
	}
	
	public void viewStudent()
	{
		Iterator i=v.iterator();
		
		if(v.isEmpty())
		{
			System.out.println("Student list is Empty");
		}
		else
		{
		while(i.hasNext())
		{
			Object obj=i.next();
			
			Module modu=(Module)obj;
			
			System.out.println(modu.getId()+"\t"+modu.getName()+"\t"+modu.getPer()+"%");
		}
		}
	}
	
	public void removeStudent()
	{
		
		
		if(v.isEmpty())
		{
			System.out.println("Student list is Empty...");
		}
		else
		{
			System.out.println("Enter id for remove student");
			int rid=sc.nextInt();
			
			Iterator i=v.iterator();
			boolean flag=false;
			
			while(i.hasNext())
			{
				Object obj=i.next();
				Module modu=(Module)obj;
				
				if(modu.getId()==rid)
				{
					i.remove();
					flag=true;
					break;
				}
			}
			if(flag!=true)
			{
				System.out.println("Id not found...");
			}
			else
			{
				System.out.println("Record deleted Succesfully...");
			}
		}
	}
	
	public void searchStudent()
	{
		if(v.isEmpty())
		{
			System.out.println("Student list is Empty...");
		}
		else
		{
			System.out.println("Enter 1 for search by id");
			System.out.println("Enter 2 for search by name");
			System.out.println("Enter choice");
			int choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				
				System.out.println("Enter id for searching");
				int sid=sc.nextInt();
				
				
				Iterator i=v.iterator();
				boolean flag=false;
				while(i.hasNext())
				{
					Object obj=i.next();
					
					Module modu=(Module)obj;
					
					if(modu.getId()==sid)
					{
						flag=true;
						System.out.println("Record found...");
						System.out.println(modu.getId()+"\t"+modu.getName()+"\t"+modu.getPer());
						break;
					}
				}
				if(flag!=true)
				{
					System.out.println("Record not found");
				}
				break;
			case 2:
				
				sc.nextLine();
				System.out.println("Enter Student name for searching");
				String sname=sc.nextLine();
				boolean f=true;
				
				for(Object obj:v)
				{
					Module modu=(Module)obj;
					
					int n=modu.getName().compareTo(sname);
					if(n==0)
					{
					   System.out.println("Record found...");
					   System.out.println(modu.getId()+"\t"+modu.getName()+"\t"+modu.getPer());
					   f=false;
					   break;
					}
				}
				if(f!=false)
				{
					System.out.println("Record not found....");
				}
				break;
				default:
					System.out.println("Wrong input");
			}
		}
	}
	
	@SuppressWarnings("unchecked")
	public void descendingStudent()
	{
		if(v.isEmpty())
		{
			System.out.println("Student list is Empty...");
		}
		else
		{
			Collections.sort(v);
			System.out.println("Sorted in descendong order");
		}
		
		for(Object obj:v)
		{
			Module modu=(Module)obj;
			
			System.out.println(modu.getId()+"\t"+modu.getName()+"\t"+modu.getPer());
		}
	}
}
