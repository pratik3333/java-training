package ThreadingSet.org;
import java.util.*;

class Test
{
    public void getorder(int no) throws OrderNotFoundException
    {
    	if(no==100)
    	{
    		throw new OrderNotFoundException("Order Not Found Exception");
    	}
    	else
    	{
    		System.out.println("Number is "+no);
    	}
    }
}
public class TestException {

	public static void main(String[] args) throws OrderNotFoundException {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int number=sc.nextInt();
		Test t=new Test();
		
			t.getorder(number);
		
	}

}
