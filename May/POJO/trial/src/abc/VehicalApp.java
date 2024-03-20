package abc;

class Vehicaln{
	
	private String brand;
	private int year;
	
	public Vehicaln(String brand, int year)
	{
		this.brand=brand;
		this.year=year;
		System.out.println("Brand is "+brand+"\n"+" year is "+year);
	}
	
	
}

class Car extends Vehicaln{
	

	
	public Car(String brand,int year)
	{
		super(brand,year);
		
	}
}


public class VehicalApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Car car=new Car("BMW", 2024);
		

	}

}
