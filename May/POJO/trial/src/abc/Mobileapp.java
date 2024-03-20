package abc;


class Mobile{
	
	Mobile()
	{
		System.out.println("I am in Mobile class");
	}
	
	protected int no;
	
	Mobile(int no)
	{
		this.no=no;
		System.out.println("Mobile number is "+ no);
	}
	
}

class Camera extends Mobile{
	
	Camera(){
		System.out.println("I am in camera class");
	}
}

class Call extends Mobile{
	
	
	Call(int no)
	{
		super(no);
		System.out.println("I am in call class");
	}
	
	
	
}

public class Mobileapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Camera cm= new Camera();
		int no=123;
		Call cl=new Call(no);
		

	}

}
