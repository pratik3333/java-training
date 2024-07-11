package Practice.org;
import java.util.*;


interface Area<E>
{
	void setRadious(E e);
}

class Circle implements Area<Integer>
{

	@Override
	public void setRadious(Integer e) {
		// TODO Auto-generated method stub
		System.out.println(" Circle Radious is " +e);
		
	}
	
}

class Cirm implements Area<Float>
{

	@Override
	public void setRadious(Float e) {
		// TODO Auto-generated method stub
		
		System.out.println("Radious of circumference is "+e);
	}
	
}
public class InterfaceWithGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle crc=new Circle();
		crc.setRadious(10);
		
		Cirm c=new Cirm();
		c.setRadious(2.5f);
	}

}
