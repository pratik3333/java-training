package ShreeKrushna.org;

import java.util.*;

interface Swimable
{
	//void setValue();
    void swim();
}

interface Flyable
{
	void fly();
}


class Bird implements Swimable,Flyable
{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Bird can fly");
		
		
	}


	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("Bird can swim");
		
	}

	
}

public class FirstInterfaceApp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Bird br=new Bird();
		br.fly();
		br.swim();
	}

}
