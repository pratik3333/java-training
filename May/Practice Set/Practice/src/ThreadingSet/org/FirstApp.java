package ThreadingSet.org;
import java.util.*;


class First extends Thread
{
	
	public void run()
	{
		try
		{
		for(int i=0; i<5; i++)
		{
//			System.out.println(i);
			System.out.println("First thread "+i);
			sleep(10000);
		}
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
	
}

class Second extends Thread
{
	public void run()
	{
		try
		{
			
			for(int i=0; i<20; i++)
			{
				System.out.println("Second Thread "+i);
				sleep(1000);
			}
		}catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
}

public class FirstApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		First f=new First();
		
		f.start();
		try {
			f.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Second s=new Second();
		s.start();
		
	}

}
