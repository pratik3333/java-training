import java.util.*;

public class VoterApp
{
	public static void main(String x[])
	{
		Voter v2[]=new Voter[5];
		VoterStore vs=new VoterStore();
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=0; i<v2.length; i++)
		{
			String name=sc.nextLine();
			int id=sc.nextInt();
			int age=sc.nextInt();
			sc.nextLine();
			
			v2[i]=new Voter();
			
			v2[i].setName(name);
			v2[i].setID(id);
			v2[i].setAge(age);
			
		}
		
		vs.setVoter(v2);
		int result=vs.getVoter();
		if(result)
		{
			 System.out.println("Product found with following details");
		}
	}
}

class Voter
{
	private int id;
	private String name;
	private int age;
	
	public void setID(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}	
	
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
		return age;
	}
}

class VoterStore
{
	boolean flag=false;
   private Voter v1[];
	
	public void setVoter(Voter v2[])
	{
		v1=v2;
	}
	
	public int getVoter()
	{
		
		for(int i=0; i<v1.length; i++)
		{ 
			if(v1[i].getAge()>=18)
			{
				flag=true;
			}
			if(flag)
			{
				return v1[i];
			}
			else
			{
				return null;
			}
		}
		
	}
}
