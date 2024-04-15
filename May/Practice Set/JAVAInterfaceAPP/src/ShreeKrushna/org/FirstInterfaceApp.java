package ShreeKrushna.org;
interface Swimable
{
	//void setValue();
    void swim();
}

interface Flyable
{
	void fly();
}

interface Walkable
{
	void walk();
}

class Bird implements Swimable,Flyable,Walkable
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
	
	public void walk()
	{
		System.out.println("Bird can walk");
	}

	
}

public class FirstInterfaceApp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Bird br=new Bird();
		br.fly();
		br.swim();
		br.walk();
	}

}
