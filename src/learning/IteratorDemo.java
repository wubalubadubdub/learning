package learning;

import java.util.ArrayList;
import java.util.ListIterator;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ali = new ArrayList<Integer>();
		ali.add(5);
		ali.add(8);
		ali.add(3);
		ali.add(27);
		
		//set up an iterator that will go through the ArrayList and print out every element
		ListIterator<Integer> litr = ali.listIterator(); 
		while(litr.hasNext()) {
			Object element = litr.next(); //automatically moves to the next element each time it executes
			System.out.println(element);
		}
		
		
		/* first create the list iterator to cycle through our list elements
		 * create the while loop that will check to see if the iterator has another element to get and execute the code block if so
		 * create an Object "element" and it assign it the value of the next element the list iterator gets
		 * print out that next element
		 * if the litr doesn't have another element to get, the loop stops, otherwise it executes again and the value of 
		 * litr.next() changes to match the next element
		 * 
		 */
		
		
			
		

	}

}
