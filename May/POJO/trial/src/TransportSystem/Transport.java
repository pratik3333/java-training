package TransportSystem;

import TransportSystem.Bus;
import TransportSystem.Truck;
import TransportSystem.Vehical;

class Vehical{
	
	protected int model;
	protected int regno;
	protected int vspeed;
	protected int fcapacity;
	protected int fconsumption;
	
	public Vehical(int model, int regno, int vspeed, int fcapacity, int fconsumption){
	
//		super();
		this.model=model;
		this.regno=regno;
		this.vspeed=vspeed;
		this.fcapacity=fcapacity;
		this.fconsumption=fconsumption;
		
	}
	
	void fuelNeeded(int km)
	{
		
	}
	
	void display()
	{
		
	}
	
	
}


class Truck extends Vehical{
	
	int cargoWeight;
	public Truck(int model, int regno, int vspeed, int fcapacity, int fconsumption,int cargoWeight)
	{
		super(model,regno,vspeed,fcapacity,fconsumption);
		this.cargoWeight=cargoWeight;
		
	}
	
	void display()
	{
		System.out.println("Truck model number is "+ model +"\n" + "Truck Registration number is "+ regno +"\n" +
				"Truck speed is " + vspeed + "\n" +"Truck fuelConsumption is " + fconsumption + "\n" + "Cargo Weight is " + cargoWeight);
	}
	
	void fuelNeeded(int km)
	{
		int fn;
		fn=km/fconsumption;
		
		System.out.println("Fuel needed is "+fn);
		
		
	}
	
	
}

class Bus extends Vehical{
	
	
	protected int npassenger;
	protected int time;
	public Bus(int model, int regno, int vspeed, int fcapacity, int fconsumption,int npassenger)
	{
		super( model,regno,vspeed,fcapacity,fconsumption);
		this.npassenger=npassenger;
	}
	
	
//	public Bus(int i, int j, int k, int l, int m, int n) {
//		// TODO Auto-generated constructor stub
//	}


	public void display()
	{
		
		System.out.println("Truck model number is "+ model +"\n" + "Truck Registration number is "+ regno +"\n" +
				"Truck speed is " + vspeed + "\n" +"Truck fuelConsumption is " + fconsumption + "\n" + "Total number of passenger is " + npassenger);
		
	}
	
	public void distanceCovered(int time)
	{
		this.time=time;
		
		int dis=vspeed/time;
		System.out.println("The Bus covered distance is " + dis);
		
	}
}




public class Transport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Truck truck =new Truck(1001, 111, 10,30, 3, 30);
		truck.display();
		truck.fuelNeeded(30);
		System.out.println("----------------***-------------------");
		

		Bus bus= new Bus(1002, 222,100,30,20,333);
		bus.display();
		bus.distanceCovered(5);
	}

}
