import java.util.*;

class T
{
	int no;
	void setValue(int no)
	{
		this.no=no;
	}
	void showTable()
	{
		int i;
		for(i=1;i<=10;i++)
		{
			System.out.printf("%d\n",no*i);
		}
	}
}

public class Table
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		T ta=new T();
		
		System.out.println("Enter Number");
		int no=sc.nextInt();
		
		ta.setValue(no);
		ta.showTable();
		
	}
}