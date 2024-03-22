
import java.util.*;

 class Vehicle
{
	protected int model;
	protected int vspeed;
	protected int fcap;
	protected int fcon;
	
	public Vehicle(int model, int vspeed, int fcap, int fcon)
	{
		this.model=model;
		this.vspeed=vspeed;
		this.fcap=fcap;
		this.fcon=fcon;
	}
	
	void display()
	{
		
	}
}	

class Truck extends Vehicle
{
	protected int cargoweight;
	protected int time;
	protected int ds;
	public Truck(int model, int vspeed, int fcap, int fcon)
	{
		super(model, vspeed,fcap,fcon);
		this.cargoweight=cargoweight;
	}
		
	public void display()
	{
		System.out.println("Truck model number is "+ model + "\n" + "Truck speed is " + vspeed + "\n" + "Truck Fuel Capacity is " + fcap + "\n" +
		"Truck fuel Consumption is" + fcon);
	}
		
	public void distance(int time)
	{
		this.time=time;
		ds=vspeed/time;
		System.out.println("Distance covered by Truck is "+ ds);
		
	}
}

public class Transport
{
	public static void main(String args[])
	{
		Truck truck=new Truck(1111,50,100,20);
		truck.display();
		truck.distance(10);
		
	}	
}