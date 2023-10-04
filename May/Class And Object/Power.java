import java.util.*;

class PowerOF
{
	int index,base;
	
	
	void setData(int index, int base)
	{
		this.index=index;
		this.base=base;
	}
	
	int showData()
	{
		int i,b=1;
		for(i=0; i<index; i++)
		{
			b=b*base;
		}
		return b;
		//System.out.printf("\nPower is: %d",b);
	}
	
}

public class Power
{
	public static void main(String x[])
	{
		 PowerOF po = new PowerOF(); //Object Creation
		
		Scanner sc=new Scanner(System.in);
		
		System.out.printf("\nEnter index\n");
		int index = sc.nextInt();
		System.out.printf("\nEnter Base: \n");
		int base = sc.nextInt();
		
		po.setData(index,base);
		
		int result = po.showData();
		if(result!=0)
		{
			System.out.printf("Power is: %d",result);
		}
	}
}