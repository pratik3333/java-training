package ThreadingSet.org;
import java.util.*;

class Firstf extends Thread
{
	public void run()
	{
		try
		{
		for(int i=1; i<=5; i++)
		{
			System.out.println("First thread "+i);
			sleep(1000);
		}
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
}


class Seconds extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1; i<=50; i++)
			{
				System.out.println("Second Thread "+i);
				sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
}
public class SecondApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Firstf f=new Firstf();
		f.run();
//		try {
//			f.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		Seconds s=new Seconds();
		s.run();

	}

}
