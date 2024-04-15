package ShreeKrushna.org;

import java.util.*;

interface Interfa
{
	//void setValue();
    void setValue(int a);
	void showValue();
}

class FirstTry implements Interfa
{

	int a;
	@Override
	public void setValue(int a) {
		// TODO Auto-generated method stub
		this.a=a;
		//System.out.println("Value is "+a);
	}

	@Override
	public void showValue() {
		// TODO Auto-generated method stub
		System.out.println("Value of A is "+a);
	}
	
}

public class FirstInterfaceApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FirstTry ftr= new FirstTry();
		
		ftr.setValue(10);
		ftr.showValue();
	}

}
