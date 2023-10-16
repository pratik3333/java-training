public class CommandLineInp
{
	public static void main(String x[])
	{
		int sum=0;
		
		int a=Integer.parseInt(x[0]);
		int b=Integer.parseInt(x[1]);
		
		sum=a+b;
		System.out.printf("Addition is %d",sum);
	}
}