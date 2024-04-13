package Threading;

class MyThreadd extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1; i<=5; i++)
			{
				System.out.println("First Thread " +i +"\t" + this.isAlive());
				
				
				if(i==3)
				{
					stop();
				}
				sleep(10000);
			}
		}
		catch(InterruptedException ex)
		{
			System.out.println(ex);
		}
	}
}

class MyThread11 extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1; i<=50; i++)
			{
				System.out.println("Second Thread "+ i);
				sleep(1000);
			}
		}
		catch(InterruptedException ex)
		{
			System.out.println(ex);
		}
	}
}


public class ThreadingApplication {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		MyThreadd m=new MyThreadd();
		m.start();
		m.join();
		
		System.out.println("Now Thread Status is "+ m.isAlive());
		MyThread11 m1=new MyThread11();
		m1.start();
		
		

	}

}
