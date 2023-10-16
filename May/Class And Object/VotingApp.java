import java.util.Scanner;

 class Voter
{
	private int id;
	private int age;
	private String name;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
		return age;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
}

 class VoterRecord
{
	private Voter []voter;
	
	public void setVoter(Voter []voter)
	{
		this.voter=voter;
	}
	 void getVoter()
	{
		System.out.println("This members are capable to vote");
		for(int i=0; i<voter.length; i++)
		{
			if(voter[i].getAge()>=18)
			{
				String name=voter[i].getName();
				int id =voter[i].getId();
				int age=voter[i].getAge();
				
				System.out.printf("%d\t%s\t%d\n",id,name,age);
			}
		}
	}
}

public class VotingApp
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		//System.out.println("How many Voter data you want to add");
		//int size=sc.nextInt();
		`
		Voter []voter=new Voter[5];
		VoterRecord vr=new VoterRecord();
		
		for(int i=0; i<voter.length; i++)
		{
			System.out.println("Enter Name id and age of voter");
			String name=sc.nextLine();
			int id=sc.nextInt();
			int age=sc.nextInt();
			sc.nextLine();
			
			
			voter[i]=new Voter();		
			voter[i].setName(name);
			voter[i].setId(id);
			voter[i].setAge(age);
		}
		
		vr.setVoter(voter);
		vr.getVoter();
		
	}
}