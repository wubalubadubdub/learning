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

/*this program prints out each word and the number of times it appears in the
 * order they appear, however the other class file modifies this to sort the
 * list by most occurrences
 */
public class WordFreq {
	public static void main(String[] args) throws IOException {

		ArrayList<String> als = new ArrayList<String>();
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

		
		ArrayList<String> alsNoDups = new ArrayList<String>();
		ArrayList<String> alsCopy = als;
		


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

				

			}

			System.out.println(searchWord + ": " + count);
			

		}

	}

}
/*
class Entry implements Comparator<Entry>, Comparable<Entry> {

	public static int count;
	public String str;
	public static ArrayList arl2 = new ArrayList<Entry>();

	Entry() {
	}

	Entry(String s, int i) {

	}

	public static ArrayList<Entry> numTimesApp(String str, ArrayList<String> arl) { //

		while (arl.indexOf(str) != -1) { // while there is another instance of
			// String str

			arl.remove(str); // keep removing instances and inc. count until
			// while cond. is false
			count++;

		}
		arl2.add(new Entry(str, count)); // put each word and number in the new
		// array using the Entry constructor
		return arl2;

	}

	public String getStr() {
		return str;
	}

	public int getCount() {
		return count;
	}

	// define the comparator
	@Override
	public int compareTo(Entry e) {
		return 0;
	}

	@Override
	public int compare(Entry e1, Entry e2) {
		return Entry.count - Entry.count; // sorts the ArrayList arl2 by
		// descending count
	}

} */
