package learning;

public class Refuel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Truck t1 = new Truck();
		t1.fillGasTank(); //fuelLvl = 20
		
		Car c1 = new Car();
		c1.fillGasTank(); //fuelLvl = 10
		
		System.out.println(t1.getFuelLvl()); //can't access fuelLvl directly because it's an instance value--it must be associated with an object
		//and its value depends on which object we're talking about, as seen above
		System.out.println(c1.getFuelLvl());

	}

}
