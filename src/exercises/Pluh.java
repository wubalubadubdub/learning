package exercises;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Pluh implements Comparator<Pluh>, Comparable<Pluh> {
	
	public static String word;
	public static int count = 1;
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// int count = 0; // doesn't make sense for count to exist on its own,
		// so
		// we make it an instance var
		ArrayList<Pluh> ale = new ArrayList<Pluh>();

		ArrayList<String> a = new ArrayList<String>();
		
		

		Scanner s = new Scanner(new BufferedReader(new FileReader( // create
				// Scanner
				// to parse
				// the text
				// file
				"C:\\Users\\intensiveporpoises\\Documents\\birds.txt")));
		try { // try to read from Scanner into an ArrayList
			while (s.hasNext()) { // while the Scanner has another String to
				// read
				a.add(s.next().replaceAll("[^a-zA-Z ]", "").toLowerCase()); // this
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
	
		try {
			
			

			
			
			

			

		} catch (IndexOutOfBoundsException ex) { // the while loop above fails
			// without this. there's
			// probably
			// a better way which I will try to work out later

		}
		//Collections.sort(ale);
		
		Collections.sort(ale, new Pluh()); // sort the ArrayList using the
		// comparator we designed that
		// sorts by descending count

		
		for (Pluh e : ale)
			System.out.println(e.getWord() + ": " + e.getCount());

	}

	
	// define the constructors

	Pluh() {
	}

	Pluh(String word, int count) {
		this.word = word;
		this.count = count;
	}
	
	//define the methods that'll be used to print out the values
	
	public String getWord() {
		return word;
	}
	
	public int getCount() {
		return count;
	}

	// define the comparator
	@Override 
	public int compareTo(Pluh e) {
		return (this.word).compareTo(e.word);
	}

	@Override
	public int compare(Pluh e1, Pluh e2) {
		return e2.count - e1.count; // sorts the ArrayList arl2 by
		 // descending count
	}

}
