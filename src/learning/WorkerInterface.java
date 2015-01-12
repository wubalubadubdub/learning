package learning;

@FunctionalInterface //to be used with lambda expressions
public interface WorkerInterface {
	/*an interface contains only abstract methods. access modifiers can be public or pkg-private(no modifier)
	 * all methods of an interface must be used by a class that implements it unless 
	 * the class is declared abstract
	 * an interface contains no constructors, cannot contain any instance fields, and any class fields must be both static and final (constants)
	 */
	
	
	public void doSomeWork();
	
	
	
}
