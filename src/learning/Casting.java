package learning;

public class Casting {
	//type of casting shown here is used when a superclass variable needs 
	//access to subclass methods

	static class Machine {

		public void start() {
			System.out.println("Machine Started");
		}
	}

	static class Camera extends Machine {
		@Override
		public void start() {
			System.out.println("Camera Started");
		}

		public void snap() {
			System.out.println("Photo Taken");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*here we're creating a subclass object that has a superclass variable 
		 * pointing to it. because the variable belongs to the superclass, we 
		 * can't use the subclass's unique methods without first casting the 
		 * superclass variable to the subclass. example of syntax:
		 * Fruit myFruit = new Banana(); ok, so myFruit is a banana but it is a variable of class "Fruit"
		 * ((Banana)myFruit).addBanana(); we couldn't use addBanana() without first casting myFruit to Banana
		 * 
		 */
		Machine m1 = new Camera();
		m1.start(); //prints "Camera Started" because the Camera start() method 
		//overrides the Machine start() method
		//m1.snap() won't compile because snap() is a method only Camera class can use
		((Camera)m1).snap(); //prints "Photo Taken"

	}

}
