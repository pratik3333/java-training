package abc;

import java.util.*;

class Model{
	 final int val=90;
	
	Model(){
		
		System.out.println("Model is default");
	}
	
	protected int mno;
	Model(int mno)
	{
		this.mno=mno;
		
		System.out.println("Your model number is " + mno);
	}
	
	
	public void show()
	{
//		final int val=90;
		
	}
}

class Laptop extends Model
{
	Laptop()
	{
		super();
		System.out.println("Proccecor is abc");
	}
}

class Macbook extends Model{
	
	Macbook(int mno)
	{
		super(mno);
		System.out.println("Proccecer is xyz ");
		
	}
	public void show() {
	   int val2=val;
	   val2++;
		System.out.println("I am override method");
		System.out.println("i am override value" + val2);
	}
}



public class LaptopApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		Laptop laptop=new Laptop();
		
		int mno;
		System.out.println("Enter macbook model number");
		
		mno=sc.nextInt();
		
		Macbook macbook=new Macbook(mno);
		macbook.show();
		

	}

}
