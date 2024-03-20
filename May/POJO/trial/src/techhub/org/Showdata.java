package techhub.org;

public class Showdata {

	void show(Edata a[])
	{
		for(int i=0; i<a.length;i++)
		{
			System.out.println(a[i].getName() + " " + a[i].getId()+" " + a[i].getSalary());
		}
		
	}
}
