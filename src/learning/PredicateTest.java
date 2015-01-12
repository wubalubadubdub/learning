package learning;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.regex.*;

public class PredicateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> strList = Arrays.asList("apple", "orange", "pear", "banana", "peach", "alfalfa");
		
		System.out.println("These words start with p: ");
		evaluate(strList, (s)-> s.startsWith("p"));  //print out all strings s such that s starts with the letter p 
		
		System.out.println("These words contain r: ");
		evaluate(strList, (s)-> s.contains("r"));
		
		System.out.println("These words are at least 5 letters long: "); //prints every word in strList but pear
		evaluate(strList, (s)-> s.length() > 4);
		
		
		
		
		

	}
	
	/*the following method takes in a list of strings and a Predicate
	 * Predicate is a functional interface, its one method being "test", which evaluates
	 * the predicate on the given argument (the current string s) and executes the code 
	 * in the if block if string s passes the test (returns true)
	 */
	public static void evaluate(List<String> ls, Predicate<String> pred) {
		for (String s: ls) { //for every string in the list we pass in 
			if(pred.test(s)) { //if the test of the string returns true
				System.out.println(s); 
			}
		}
	}

}
