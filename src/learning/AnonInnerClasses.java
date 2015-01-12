package learning;

public class AnonInnerClasses {
	
	public void print() {
		System.out.println("Outer class message");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}

class AnotherClass {
	/*the code below creates an anonymous inner class
	 * the syntax is unusual--we are creating an instance of a subclass of the class AnonInnerClasses
	 * this instance "a1" is an instance of an anonymous subclass of the AnonInnerClasses class 
	 * we don't give the class name--we jump straight to creating an instance of the class 
	 * all we have is the reference variable a1 for the anonymous inner class. semicolon goes after the 
	 * closing brackets of the anon. class. a1 is a superclass reference that points to a subclass object
	 * this is an example of polymorphism. using the anonymous inner class reference variable type (a1), 
	 * you can only call methods that are defined inside the type (class) of the reference variable
	 * this means with a1 we can only call methods defined in the superclass AnonInnerClasses
	 * 
	 */
	AnonInnerClasses a1 = new AnonInnerClasses() {
		public void print() {
			System.out.println("Anonymous class message");
		}
	};
}

/*
 * anonymous classes can also implement an interface. such code appears to create an instance of the 
 * interface, but rather creates an instance of an anonymous class that implements the interface
 */

interface ExampleInterface {
	public void read();
}

class Class1 {
	ExampleInterface e = new ExampleInterface() { //anonymous class implements the interface Example
		public void read() {
		System.out.println("Method invoked from anonymous class");
		}
	};
}