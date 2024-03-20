package techhub.org;
import java.util.*;


public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		Edata ed[]=new Edata[3];
		
		String name;
		int id;
		int salary;
		
		for(int i=0; i<ed.length; i++)
		{
			System.out.println("Enter name id and salary");
			
			
			
			name=sc.nextLine();
			id=sc.nextInt();
			salary=sc.nextInt();
			sc.nextLine();
			ed[i]=new Edata(name,id,salary);
//			ed[i].setName(name);
//			ed[i].setId(id);
//			ed[i].setSalary(salary);
			
			
		}
		
		Showdata sd=new Showdata();
		sd.show(ed);

	}

}
