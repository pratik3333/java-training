import java.util.*;

class Rectangle
{
	int len,wid,result;
	void setLengthWidth(int len,int wid)
	{
		this.len=len;
		this.wid=wid;
		
	}
	void showArea()
	{
		result=len*wid;
		System.out.printf("Area of rectangle is %d ",result);
	}
}

public class AreaOfRectangle
{
	public static void main(String x[])
	{
		int len;
	int wid;
		Rectangle re = new Rectangle();
	Scanner sc =new Scanner(System.in);
	System.out.printf("\nEnter Length of Reactangle\n");
	len = sc.nextInt();
	System.out.printf("\nEnter width of Rectangle\n");
	wid = sc.nextInt();
	
    re.setLengthWidth(len,wid);
    re.showArea();	
	}
}