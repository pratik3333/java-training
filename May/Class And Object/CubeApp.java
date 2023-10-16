import java.util.Scanner;

class Cube
{
	private int a;
	
	void setValue(int a)
	{
		this.a=a;
	}
	
	int getCube()
	{
		int b= a*a*a;
		return b;
	}
}

public class CubeApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		
		int a;
		System.out.println("Enter value");
		a=sc.nextInt();
		
		Cube c=new Cube();
		c.setValue(a);
		int result = c.getCube();
		System.out.println("Cube is "+result);
	}
}