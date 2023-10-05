import java.util.*;

class Circle
{
	float radius;
	float pi=3.14f;
	float result;
	void setRadius(float radius)
	{
		this.radius=radius;
	}
	void showArea()
	{
		result=(pi)*(radius*radius);
		
		System.out.printf("Area of circle is %f",result);
	}
}

public class AreaApp
{
	public static void main(String x[])
	{
		Circle c =new Circle();
		float radius;
		Scanner sc = new Scanner(System.in);
		System.out.printf("\nEnter radius\n");
		radius=sc.nextFloat();
		
		c.setRadius(radius);
		c.showArea();
	}
}