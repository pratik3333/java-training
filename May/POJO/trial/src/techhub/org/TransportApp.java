package techhub.org;

class Vehical {

	protected int vehicalModel;
	protected int rModel;
	protected int vSpeed;
	protected int fuelCap;
	protected int fuelCon;

	public Vehical(int vehicalModel, int rModel, int vSpeed, int fuelCap, int fuelCon) {
		super();
		this.vehicalModel = vehicalModel;
		this.rModel = rModel;
		this.vSpeed = vSpeed;
		this.fuelCap = fuelCap;
		this.fuelCon = fuelCon;
	}

	public void setrModel(int rModel) {
		this.rModel = rModel;
	}

	void fuelNeeded(int km) {
		// int result = km/fuelCon;
	} 

	int distanceCovered(int time){
		return 0;
	}

	void display() {

	}
	Vehical(){
		
	}
}

class Truck extends Vehical {

	int cargoWeight;

	public Truck(int vehicalModel, int rModel, int vSpeed, int fuelCap, int fuelCon, int cargoWeight) {
		super(vehicalModel, rModel, vSpeed, fuelCap, fuelCon);
		// TODO Auto-generated constructor stub
		this.cargoWeight = cargoWeight;
	}

	void fuelNeeded(int km) {
		int result = km / fuelCon;
		System.out.println("Avegrge:" + result);
	}

	int distanceCovered(int time) {
		return vSpeed / time;
		// System.out.println("Distance Covered:"+result);

	}

	void display() {

		System.out.println(
				"Vechical Model\tRegistration NO\tVehical Speed\tFuealCapacity\tFuel Consumption\tCargoWeight");
		System.out.println(
				vehicalModel + "\t" + rModel + "\t" + vSpeed + "\t" + fuelCap + "\t" + fuelCon + "\t" + cargoWeight);
	}

	public Truck() {
		super();
		// TODO Auto-generated constructor stub
	}

//	public Truck(int vehicalModel, int rModel, int vSpeed, int fuelCap, int fuelCon) {
//		super(vehicalModel, rModel, vSpeed, fuelCap, fuelCon);
//		// TODO Auto-generated constructor stub
//	}

		
}

class Bus extends Vehical {

	int nPassenger;

	public Bus(int vehicalModel, int rModel, int vSpeed, int fuelCap, int fuelCon, int nPassenger) {
		super(vehicalModel, rModel, vSpeed, fuelCap, fuelCon);
		// TODO Auto-generated constructor stub
		this.nPassenger = nPassenger;
	}
//
//	void fuelNeeded(int km) {
//		int result = km / fuelCon;
//		System.out.println("Avegrge:" + result);
//	}
//
//	int distanceCovered(int time) {
//		return vSpeed / time;
//		// System.out.println("Distance Covered:"+result);
//
//	}

	void display() {

		System.out
				.println("Vechical Model\tRegistration NO\tVehical Speed\tFuealCapacity\tFuel Consumption\tnPassenger");
		System.out.println(
				vehicalModel + "\t" + rModel + "\t" + vSpeed + "\t" + fuelCap + "\t" + fuelCon + "\t" + nPassenger);
	}

}

public class TransportApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Truck truck = new Truck();
		truck.setrModel(423);
		truck.fuelNeeded(100);
		int result = truck.distanceCovered(5);
		System.out.println("Distance Covered:" + result);
		truck.display();
		System.out.println("------------------xx-----------------");

		Bus bus = new Bus(2001, 211, 120, 20, 15, 18);

		bus.display();

	}

}
