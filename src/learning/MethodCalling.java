package learning;
import relearning.Cat;
public class MethodCalling {

	@SuppressWarnings("unused") //remove warnings for unused variables
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//To call a static function, you do NOT need an instance of a MyFunctionClass object
		
		String myStaticString = MyFunctionClass.myStaticFunction();
		
		//to call a non-static (instance) function, you must create an object of class 
		//MyFunctionClass first
		MyFunctionClass varname = new MyFunctionClass();
		
		String myInstanceString = varname.myFunction();
		
		System.out.println(exercises.Math.factorial(10)); 
		//since the method factorial in package exercises is public, I can use the method
		//in this or any other package. the default (no access modifier) is package-private
		//meaning I'd only be able to use the function in that package
		//calling a method in another class uses syntax classname.methodname
		//calling a method in another package uses syntax packagename.classname.methodname
		
		Cat Rocko = new Cat("Rocko"); //from project "relearning"
		//calling a method from another project requires adding an import in the form
		//packagename.classname, and then adding the packagename to the buildpath of 
		//the current package
		Rocko.getName();
		Rocko.printName();
		
		
	}

}
