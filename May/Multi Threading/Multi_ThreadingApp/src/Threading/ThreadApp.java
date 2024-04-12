package Threading;
import java.util.*;

class MyThread extends Thread
{
	public void run()
	{
		try
		{
		for(int i=1; i<=5; i++)
		{
			System.out.println(i);
			sleep(1000);
		}
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
}

public class ThreadApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		MyThread mt= new MyThread();
		
		mt.start();
		
	}

}
