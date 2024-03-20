package abc;
import java.util.*;
class Vehicaln{
	
	private String brand;
	private int year;
	
	public Vehicaln(String brand, int year)
	{
		this.brand=brand;
		this.year=year;
		System.out.println("Brand is "+brand+"\n"+" year is "+year);
	}
	
	public void vehicalNo()
	{
		
	}
	
}

class Car extends Vehicaln{
	

	private int ave;
	private int no;
	
	public Car(String brand,int year, int ave)
	{
		super(brand,year);
		System.out.println("Average is "+ave);
		
	}
	
	public void vehicalNo(int no)
	{
		this.no=no;
		System.out.println("Car registration number is "+no);
	}
}


public class VehicalApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		
		Car car=new Car("BMW", 2024,33);
		System.out.println("Enter car number");
		int no=sc.nextInt();
		car.vehicalNo(no);
		
		
		

	}

}
