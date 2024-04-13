package Threading;
import java.util.*;

class MyThreadfirst extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1; i<=5; i++)
			{
				System.out.println("First Thread " + i);
				sleep(10000);
			}
			
		}
		catch(InterruptedException ex)
		{
			System.out.println(ex);
		}
	}
}

class MyThread1 extends Thread
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
		catch(InterruptedException ex)
		{
			System.out.println(ex);
		}
	}
}

public class ThreadTestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThreadfirst m=new  MyThreadfirst();
		m.start(); //this start can call the run method of Thread
		
		MyThread1 m1=new MyThread1();
		m1.start(); //this also
	}

}
