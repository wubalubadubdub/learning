package learning;

public class Variables {
	
	
    public static void main(String[] args) {
    	
    	
/* local variables are declared in methods, constructors, or blocks, like this main method.
 * they are created when the method/block/constructor is entered and
 * destroyed once it is exited. Access modifiers like private cannot
 * be used with local variables. There is no default value for local
 * variables so they must be declared and initialized (given an initial value)
 * before first use.
 */
        int a = 5;  
        a = a+3; 
        
      //int a;
      //a = a+3; doesn't work because local var a has to be initialized before it can be used
        
        
        Variables dog = new Variables();
        int result = dog.add(5,7);
        System.out.println(result);     
        
    }

    
    public int add(int i, int j) {
		// TODO Auto-generated method stub
		int k = i+j;
		return k;
	} 
    
    public int minValue(int n1, int n2) {
		// TODO Auto-generated method stub
	 int min = 0;
		 if (n1 > n2) {
			 min = n2;
			 return min;
		 }
		 else {
			 min = n1;
			 return min;
		 }
		 
	} 

/*instance variables appear outside methods/constructors/blocks but inside classes. They hold 
 * values that must be used by more than one method/constructor/block. They can be given the 
 * access modifiers public(visible to the world), private(visible to the class only) or 
 * protected(visible to the package and all subclasses in other pkgs). Side note: the default, 
 * with no modifier, is package-private--only visible with its own pkg. Normally these variables
 * are private. 
 * instance variables have default values: for numbers it's 0, for booleans false and for 
 * object reference it's null.  
 */
 
public int numEmployees; //this is visible to any child class
@SuppressWarnings("unused")
private double salary; //this is only visible to class "Variables"

 
    
 /*class (or static) variables are declared in the same location as above. they are declared with the static keyword
  * there's only one copy of a class variable per class, regardless of how many objects are created from it
  * these are rarely used other than being declared as constants. these will include the word "final" in addition to static. 
  * once defined, the value of constants cannot change, although they are still considered variables
  * constants are given names in all uppercase, by convention
  * most are declared public since they must be available to users of the class
  * default values are the same as for instance variables
  */
public static final String COMPANY_NAME = "Beargrills Productions, LLC"; //example of a constant
public static final double SPEED_OF_LIGHT = 2.998E8; //units are m/s

}
	
  
    	 
    	
    	
    	 
     
    
  

