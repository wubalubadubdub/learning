package learning;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.ListIterator;

public class Counter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> als = new ArrayList<String>(); // contains the raw
															// data the Scanner
															// writes
		ArrayList<String> alsNoDups = new ArrayList<String>();
		ArrayList<String> alsCopy = als;

		als.add("cat"); // at index 0
		als.add("dog"); // at index 1
		als.add("dog"); // etc
		als.add("sheep");
		als.add("horse");
		als.add("dog");
		als.add("horse");

		LinkedHashSet lhs = new LinkedHashSet(); // create a linkedhashset that
													// will remove the dups but
													// retain the order
		lhs.addAll(als);
		alsNoDups.addAll(lhs);

		ListIterator litr = alsNoDups.listIterator();

		while (litr.hasNext()) { // while there's another word in alsNoDups to
									// search through als for
			// one execution of this while loop goes with a single word in
			// alsNoDups
			Object searchWord = litr.next();
			int count = 0;
			als = alsCopy;

			while (als.indexOf(searchWord) != -1) { // als.indexOf(searchWord)
													// != -1. How many times
													// does the while loop
													// execute?
				count++;
				int sLoc = als.indexOf(searchWord); // get the index where the
													// word first occurs and
													// call it sLoc
				// als = (ArrayList<String>)( als.subList((sLoc+1),
				// als.size())); //create a sublist that starts
				// at the next index after the word was found and ends at the
				// index that's 1 less than the length
				ArrayList<String> als2 = new ArrayList<String>(als.subList(
						(sLoc + 1), als.size()));
				als = als2;

				// must fix--produces sheep: 0 horse: 1 because after sublisting
				// twice for dog, als is just "horse"

			}

			System.out.println(searchWord + ": " + count);

		}

	}

}
