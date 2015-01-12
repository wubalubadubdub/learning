package learning;


/*Method overriding occurs when a child class inherits a method from its parent but changes the method body, leaving everything else about the
 * method the same. What the method does changes slightly based on the needs of the child class. method overriding occurs at run time. Only 
 * instance methods can be overridden. with a static method the method is hidden instead. 
 */

public class MethodOverriding {
		
	public void testMethod() {
		System.out.println("The parent method was called");
	}
		public class OverrideTest extends MethodOverriding {
			@Override //this tells the compiler to make sure the method is actually overridden as intended. if not, results in a compile time err
			public void testMethod() {
				System.out.println("The child method was called, overriding the parent method");
			}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to run the following code, remove static keyword from the OverrideTest class
		MethodOverriding objPar = new MethodOverriding();
		objPar.testMethod(); 
		OverrideTest objChild = objPar.new OverrideTest();
		objChild.testMethod();
		
		
		/*add static keyword to OverrideTest and comment out above code before running code below 
		MethodOverriding objPar = new MethodOverriding();
		objPar.testMethod();
		
		OverrideTest objChild = new OverrideTest();
		objChild.testMethod();
		*/
		

	}

}
