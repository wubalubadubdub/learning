package learning;
/*method overloading is when two or more methods in the SAME class have the exact same name but different parameters
 * either the number or type of parameters can be changed in order to overload a method. changing just the return type or 
 * the names of the parameters will result in a compiler error
 * the compiler determines whether the method is correctly overloaded at compile time and returns an error if it isn't
 * below are examples of method overloading
 */
public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	@SuppressWarnings("unused")
	private String name;
	@SuppressWarnings("unused")
	private int age;
	
	public void setInfo(String inName) {
		name = inName;
	}
	
	public void setInfo(String inName, int inAge) {  //1st type of method overloading
		//the method has the same name and return type but the number of parameters has changed
		name = inName;
		age = inAge;
	}
	
	public void setInfo(int inAge){ //2nd type of overloading. the type of the parameter changed compared to the 1st one
		age = inAge;
	}

}
