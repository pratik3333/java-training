package Practice.org;
import java.util.*;

interface Area<E>
{ 
	void setRadious(E a);
}

class Circle implements Area<Integer>
{

	@Override
	public void setRadious(Integer a) {
		// TODO Auto-generated method stub
		System.out.println("Integer Radious is "+a);
	}
}

class Circumference implements Area<Float>
{

	@Override
	public void setRadious(Float a) {
		// TODO Auto-generated method stub
		
		System.out.println("Float Radious is "+ a);
	}
	}

public class SettingRadious {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle cr=new Circle();
		cr.setRadious(10);
		
		Circumference crcm=new Circumference();
		crcm.setRadious(3.4f);
		
	}

}
