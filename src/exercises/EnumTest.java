package exercises;
/*An enum is a special data type that allows a variable to only be one of the 
 * predefined constant values for it. A common example would be compass directions
 *  (NORTH, SOUTH, EAST, and WEST). Use an enum any time you need to represent a fixed 
 *  range of constants, like months of the year, planets in our solar system, and so on. 
 */
public class EnumTest {
	Month m; //instance variable m
	
	public enum Month {
		JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, NOVEMBER, DECEMBER 
	}
	
	/*following commented code not needed for the demonstration. just an example usage of the "this" keyword 
	 * public EnumTest() {
		this(Month.JANUARY); //this refers to the current object, which is the empty EnumTest
		//constructor. so the above line calls the parameterized constructor below and creates a new 
		//object with the parameter equal to the value in () when the empty constructor is called
		
	} */
	
	public EnumTest(Month m) { //constructor parameter m 
		this.m = m; //this.m refers to the instance variable m. it points to the value m, which is 
		//the parameter for this constructor
		//System.out.println("Parameterized constructor invoked"); //used with empty constructor code commented out above
	}
	
	public void monthEvaluator() {
		switch(m) {  //prints msg that depends on what month m the method is called on
		case DECEMBER: case JANUARY: case FEBRUARY: 
			System.out.println("I'm freezing balls man");
			break;
		
		
			
		case JUNE: case JULY: case AUGUST:
			System.out.println("It's summer bitch!");
			break;
			
		default:
			System.out.println("Feels pretty good bro");
			break;
		}
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnumTest m1 = new EnumTest(Month.JANUARY); //m == JANUARY. 
		EnumTest m6 = new EnumTest(Month.JUNE);
		EnumTest m11 = new EnumTest(Month.NOVEMBER);
		m1.monthEvaluator();
		m6.monthEvaluator();
		m11.monthEvaluator();

	}

}



