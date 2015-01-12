package learning;

/*A subclass inherits all of the public and protected members of its parent, no matter what package the subclass is in. If the subclass is in the
 same package as its parent, it also inherits the package-private members of the parent. You can use the inherited members as is, replace them, 
 hide them, or supplement them with new members:


 The inherited fields can be used directly, just like any other fields.
 You can declare a field in the subclass with the same name as the one in the superclass, thus hiding it (not recommended).
 You can declare new fields in the subclass that are not in the superclass.
 The inherited methods can be used directly as they are.
 You can write a new instance method in the subclass that has the same signature as the one in the superclass, thus overriding it.
 You can write a new static method in the subclass that has the same signature as the one in the superclass, thus hiding it.
 You can declare new methods in the subclass that are not in the superclass.
 You can write a subclass constructor that invokes the constructor of the superclass, either implicitly or by using the keyword super.

 A subclass does not inherit the private members of its parent class. However, if the superclass has public or protected methods for accessing 
 its private fields, these can also be used by the subclass.

 A nested class has access to all the private members of its enclosing class—both fields and methods. Therefore, a public or protected nested class
 inherited by a subclass has indirect access to all of the private members of the superclass.
 */

public class Bicycle {

	// Bicycle class has three fields...
	public int cadence;
	public int gear;
	public int speed;

	// ...and one constructor...
	public Bicycle(int startCadence, int startSpeed, int startGear) {
		gear = startGear;
		cadence = startCadence;
		speed = startSpeed;
	}

	// ...and four methods
	public void setCadence(int newValue) {
		cadence = newValue;
	}

	public void setGear(int newValue) {
		gear = newValue;
	}

	public void applyBrake(int decrement) {
		speed -= decrement; // same as speed = speed - decrement
	}

	public void speedUp(int increment) {
		speed += increment; // same as speed = speed + increment
	}
	
	public int getCadence() {
		return cadence;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// because MountainBike is not a static class, we must create an
		// instance of the superclass before we can create an instance of it

	}

}

/*
 * create subclass of Bicycle called MountainBike that inherits the fields and
 * methods of its superclass Bicycle and can define its own too since we defined
 * a constructor in the superclass we must define one in the subclass as well
 */
class MountainBike extends Bicycle {
	// the MountainBike subclass adds one field...
	public int seatHeight;
	public MountainBike myBike; /*
								 * this is descended from Bicycle, which is
								 * descended from Object.. //so myBike is a
								 * MountainBike, a Bicycle, and an Object and
								 * can also be used wherever Bicycle or Object
								 * objects are called for //however the reverse
								 * isn't necessarily true. we could have, for
								 * example, an object that's neither a Bicycle
								 * nor a MountainBike //casting shows the use of
								 * an object of one type in place of another,
								 * among objects allowed by inheritance and
								 * implementation
								 */
	public Object obj = new MountainBike(0, 0, 0, 0); // obj is both an Object
														// and a MountainBike
														// (until such time as
														// obj is assigned
														// another object that
														// is not a
														// MountainBike). This
														// is called implicit
														// casting.
	MountainBike anotherBike = (MountainBike) obj; // this is explicit casting.

	// ...and has its own constructor...

	public MountainBike(int startHeight, int startCadence, int startSpeed,
			int startGear) {
		super(startCadence, startSpeed, startGear); // use the same three
													// parameters and variables
													// as in the superclass
													// constructor
		seatHeight = startHeight; // and set the new parameter equal to the new
									// variable
	}

	// ..and adds one method
	public void setHeight(int newValue) {
		seatHeight = newValue;
	}

}
