public class CommandLineInput
{
	public static void main(String x[])
	{
		float radious=Float.parseFloat(x[0]);
		
		float diameter = radious+radious;
		System.out.printf("Diameter of Circle is %f",diameter);
	}
}