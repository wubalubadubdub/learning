package learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class Lambdas {
	
	/*A lambda expression is an anonymous function (almost). in java lambda expressions are 
	 * represented as objects, so they are bound to a particular object type called a functional interface
	 * a functional interface is an interface with just one abstract method declared in it 
	 * we use anonymous inner classes to instatiate objects of functional interface
	 * with lambda expressions, this can be simplified 
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		ArrayList<Integer> ali = new ArrayList<Integer>();
		int numToAdd = 1;
		for (int i = 0; i < 5; i++) {
			ali.add(numToAdd);
			numToAdd++;
		}

		Collections.sort(ali, new ValueComparator());
		ListIterator litr = ali.listIterator();
		while (litr.hasNext()) {
			Object elem = litr.next();
			System.out.println(elem);
		}
		
		List<Integer> listOld = Arrays.asList(1, 2, 3, 4, 5, 6);
		//old way
		for (Integer n: listOld) {
			System.out.println(n);
		}
		
		//new way 
		listOld.forEach(n -> System.out.println(n));
		//or we can use the :: operator
		listOld.forEach(System.out::println);
		
		
		
		//old way 
		
		int sum = 0;
		for(Integer n : listOld) {
			int x = n * n;
			sum = sum + x;
		}
		System.out.println(sum);
		
		//new way
		List<Integer> listNew = Arrays.asList(1, 2, 3, 4, 5, 6);
		int sum2 = listNew.stream().map(x -> x*x).reduce((x,y) -> x + y).get();  //the .stream() converts the data in the list to a 
		//a stream of data that can be mapped. in this case it's like we're mapping the variable x to the function x^2
		/* the reduce((x,y) -> x + y) part: reduce takes a "binary operator", which is a functional interface and so can be the assignment
		 * target of a lambda expression like this one.  
		 * 
		 */
		System.out.println(sum2);
		
		
				

	}

	static class ValueComparator implements Comparator<Integer> {

		
		@Override
		public int compare(Integer int1, Integer int2) {
			// TODO Auto-generated method stub
			return Integer.compare(int2, int1); // returns 0 if int1 and int2
												// are equal, a negative num. if
												// int1 < int2, and a positive
												// num. if int2 > int1
			
			//Integer.compare(int1, int2): int1 == int2? return 0. int1 < int2? return -, int1 comes before int2. int1 > int2? return +, int2 comes before int1
			//this results in a sort by increasing value
			//Integer.compare(int2, int1): int1 == int2? return 0. int2 < int1? return -, int2 comes before int1. etc etc. they switch roles so the result switches. 
			//this results in a sort by decreasing value 
			
		}

	}

}
