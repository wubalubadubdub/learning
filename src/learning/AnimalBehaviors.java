package learning;
/* An interface contains behaviors that a class implements. All methods in an interface are abstract (used when you want a class 
 * to contain a particular method but you want the actual implementation of that method to up to the child classes. the parent class
 * is declared abstract in this case.) All fields must be static (because an interface can't contain instance fields) 
 * and final. It contains no constructors. An interface can extend multiple interfaces.
 *  
 */
public interface AnimalBehaviors {
	
	public void eat();
	
	public void sleep();
	
	public void poop();
	
	public void mate();
	
	
}
