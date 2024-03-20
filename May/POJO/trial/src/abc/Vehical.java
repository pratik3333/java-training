package abc;


class Milage{
	
	 Milage(){
		System.out.println("I am in Milage");
	}
	 protected int fuel;
	 
	 Milage(int fuel)
	 {
		 this.fuel=fuel;
		System.out.println("Tuck consume " + fuel + " Ltr. fuel");
	 }
}
class Truck extends Milage{
	
	 Truck(int fuel)  //5
	{
		 super();
		 
		
		System.out.println("I am in Truck class");
	}
	

	
}


public class Vehical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int fuel=5;
		Truck truck=new Truck(fuel);
	}

}
