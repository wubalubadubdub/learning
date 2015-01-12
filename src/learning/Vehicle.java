package learning;

public abstract class Vehicle {
	/* with an abstract class you can make behaviors that are common to all subclasses but
	 * which are performed in different ways by the subclasses. by declaring a method 
	 * abstract you force subclasses to provide a custom implementation for it. you cannot
	 * create an instance of an abstract class. so here vehicle is the abstract concept, 
	 * and things like car and truck are concrete manifestations of the concept
	 *  
	 */
	
	int fuelLvl;
	public void start() {
		System.out.println("Vehicle started");
	}
	
	
	public int getFuelLvl() { //not an abstract method. the way of getting the fuel lvl 
		//will be the same for all subclasses unless they override this method
		return fuelLvl;
	}
	
	public abstract void fillGasTank(); //value of fuelLvl after filling the tank will depend on type of vehicle
	//abstract methods have no body. they leave it to the class
	//that implements them to make up its own body for the method
		
	
 	

}

class Truck extends Vehicle {
	//implementing the start and drive methods is optional, but fillGasTank is not 
	//since it is an abstract method of the parent class. 
	
	
	//it's only necessary to write the start and drive methods if we're going to override them
	// because we already have access to them as a child of the parent class that defines them
	@Override
	public void start() {
		System.out.println("Truck started");
	}
	

	
	public void fillGasTank() {
		fuelLvl = 20;
	}
}

class Car extends Vehicle {
	
	//could use non-abstract methods from the parent class, but not necessary. if vehicle was an interface instead, 
	//we'd have to implement all of its methods
	
	public void fillGasTank() {
		fuelLvl = 10;
	}
	
}





