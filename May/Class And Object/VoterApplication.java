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
	private Voter voter;
	
	public void setVoter(Voter voter)
	{
		this.voter=voter;
	}
	public void getRecord()
	{
		int id=voter.getId();
		String name=voter.getName();
		int age=voter.getAge();
		
		System.out.printf("%d\t%s\t%d",id,name,age);
	}
}

public class VoterApplication
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		
		Voter voter=new Voter();
		VoterRecord vr=new VoterRecord();
		
		System.out.println("Enter name id age");
		String name=sc.nextLine();
		int id=sc.nextInt();
		int age=sc.nextInt();
		
		voter.setName(name);
		voter.setId(id);
		voter.setAge(age);
		
		vr.setVoter(voter);
		vr.getRecord();
	}
}