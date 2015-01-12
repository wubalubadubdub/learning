package exercises;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Scanner;

/*this program modifies the other class file WordFreq to sort the
 * list by most occurrences, however it gives a runtime error. 
 * I may revisit this later to fix it but I'm burnt out on 
 * this program for now
 */
public class WordFreq2 {
	static ArrayList<String> als = new ArrayList<String>();
	
	
	public static void main(String[] args) throws IOException {

		
		Scanner s;
		
			s = new Scanner(new BufferedReader(new FileReader(
					"C:\\Users\\intensiveporpoises\\Documents\\birds.txt")));
		
		
		try { // try to read from Scanner into an ArrayList
			while (s.hasNext()) { // while the Scanner has another String to
				// read
				als.add(s.next().replaceAll("[^a-zA-Z ]", "").toLowerCase()); // this
				// takes
				// the
				// String,
				// strips out punctuation and ensures it's lower case, and then
				// adds it to the array

			}

		} finally { // even though scanner itself is not a stream, we need to
			// close it to be done with its underlying stream
			if (s != null) {
				s.close();
			}
		}

		// we now have a comma separated ArrayList of words all in lowercase, so
		// for xanadu.txt we have:
		// [in, xanadu, did, kubla, khan, a, stately, pleasuredome, decree,
		// where, alph, the, sacred, river,
		// ran, through, caverns, measureless, to, man, down, to, a, sunless,
		// sea]

		
		

		
		getWordCount(als);
		
		

		
	
	 /*String getSearchWord() {
			return searchWord;
		}

		 int getCount() {
			return count;
		} */

	/*class WordCount extends WordFreq2 {
		
		public void getWordCount (ArrayList<String> a) {
			while (litr.hasNext()) { // while there's another word in alsNoDups to
				// search through als for
				// one execution of this while loop goes with a single word in
				// alsNoDups
					String searchWord = (String) litr.next();
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

						

					}
					Entry e = new Entry(searchWord, count);
					ale.add(e);
					System.out.println(searchWord + ": " + count);
					//sort the ale by descending count value
					
					

				}

			} 
		} */
	}


	private static void getWordCount(ArrayList<String> a) {
		// TODO Auto-generated method stub

		ArrayList<String> alsCopy = als;
		ArrayList<String> alsNoDups = new ArrayList<String>();
		ListIterator litr = alsNoDups.listIterator();
		ArrayList<Entry> ale = new ArrayList<Entry>();
		


		LinkedHashSet lhs = new LinkedHashSet(); // create a linkedhashset that
		// will remove the dups but
		// retain the order
		lhs.addAll(als);
		alsNoDups.addAll(lhs);

		
		
		while (litr.hasNext()) { // while there's another word in alsNoDups to
			// search through als for
			// one execution of this while loop goes with a single word in
			// alsNoDups
				String searchWord = (String) litr.next();
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

					

				}
				Entry e = new Entry(searchWord, count);
				ale.add(e);
				System.out.println(searchWord + ": " + count);
				//sort the ale by descending count value
				
				

			}
		
	}
}

class Entry implements Comparator<Entry>, Comparable<Entry> {

	
	Entry() {
	}

	Entry(String s, int i) {

	}

	

	
	// define the comparator
	@Override
	public int compareTo(Entry e) {
		return 0;
	}

	@Override
	public int compare(Entry e1, Entry e2) {
		//return Entry.count - Entry.count; // sorts the ArrayList arl2 by
		// descending count
		return 0;
	}

} 
