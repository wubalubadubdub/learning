package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*This program creates sets and does operations like union(or)
 * and intersection(and) on them. The structure storing the
 * set elements shouldn't allow duplicates and the order of the
 * elements shouldn't matter. Sets are immutable so when doing the set
 * operations, new sets will need to be created.
 * The class should expose a method called "contains" that accepts an integer
 * and returns whether the set contains that integer or not. The constructor
 * of the class should accept a list/array of integers. There should be static
 * methods for the union and intersection which accept two sets and return a
 * new set, as well as another static method "equals" that accepts two sets
 * and returns a boolean value that says whether they are exactly the same.
 * Finally, the set should be convertible to a string in some way, which shows
 * all items in the set in increasing order
 *
 *
 */
public class Set {

	private ArrayList<Integer> intHolder = new ArrayList<Integer>(); // instance
	// variable
	// with
	// potential
	// different
	// value
	// for
	// each
	// Set
	// object
	private ArrayList<Integer> noDupsIntHolder = new ArrayList<Integer>(); // temporary,
	// for
	// stripping
	// out
	// the
	// duplicates
	// in
	// intHolder
	private static ArrayList<Integer> unionOfSets = new ArrayList<Integer>();
	private static ArrayList<Integer> intersectionOfSets = new ArrayList<Integer>();

	public Set(ArrayList<Integer> intHolder) {
		this.intHolder = intHolder;

		// write the values into a new set so that it will contain no duplicates
		for (int i : this.intHolder) {
			if (!noDupsIntHolder.contains(i)) { // if it doesn't already contain
				// i
				noDupsIntHolder.add(i); // add i to the no-duplicate set
			}
		}

		// perform sorting on noDupsIntHolder. this default sort is by ascending
		// value
		Collections.sort(noDupsIntHolder);

		this.intHolder = noDupsIntHolder; // now the Set contains an ArrayList
		// of Integers with no duplicates
		// and sorted by inc. value

	}

	public boolean containsElement(int i) { // you call this on a Set. if the
		// Set contains i,
		// return true, else return false
		intHolder = this.getIntHolder();
		if (intHolder.indexOf(i) != -1) { // if the ArrayList contains the int
			return true;
		} else
			return false;

	}

	static Set union(Set s1, Set s2) {
		// code for returning the union (or) of two sets goes here
		// temp code below
		// ArrayList<Integer> ph = new ArrayList<Integer>(0);
		// return ph;
		// if element is contained in s1 || contained in s2
		ArrayList<Integer> ali1 = s1.getIntHolder();
		ArrayList<Integer> ali2 = s2.getIntHolder();

		for (Integer i : ali1) { // add elements from first set
			unionOfSets.add(i);
		}

		for (Integer i : ali2) { // if the union set doesn't already contain an
			// element in the second set, add it
			if (!unionOfSets.contains(i)) {
				unionOfSets.add(i);
			}
		}
		Collections.sort(unionOfSets); // sort the union set by ascending value
		Set unionSet = new Set(unionOfSets);

		return unionSet;

	}

	static Set intersection(Set s1, Set s2) {

		ArrayList<Integer> ali1 = s1.getIntHolder();
		ArrayList<Integer> ali2 = s2.getIntHolder();
		for (Integer i : ali1) {
			if (ali2.contains(i)) { // if element is in s1 && s2
				intersectionOfSets.add(i);
			}
		}
		Collections.sort(intersectionOfSets);
		Set intersectionSet = new Set(intersectionOfSets);
		return intersectionSet;
	}

	static boolean equals(Set s1, Set s2) {
		// code for comparing two sets to see if they are equal goes here
		ArrayList<Integer> ali1 = s1.getIntHolder();
		ArrayList<Integer> ali2 = s2.getIntHolder();

		if (ali1.size() != ali2.size()) { //if they don't have the same # of elements, no way they can be =
			return false;
		} else {
			int count = 0;
			for (Integer i : ali1) {
				if (ali2.contains(i)) {
					count++;
				}
			}

			if (count == ali2.size()) {
				return true;
			} else
				return false;
		}

	}

	void printFormatter() {
		ArrayList<Integer> a = this.getIntHolder(); // get the ArrayList the set
													// contains
		System.out.print("{");
		for (Integer i : a) {
			if (a.indexOf(i) != (a.size() - 1)) { // if the Integer i
													// isn't the last
													// element in the union
													// ArrayList
				System.out.print(i + ", ");

			} else
				System.out.print(i + "}");

		}
		System.out.println();
	}

	public ArrayList<Integer> getIntHolder() {
		return intHolder;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> setArrayList = new ArrayList<Integer>(Arrays.asList(
				3, 3, 25, 14, 7, 7)); // setArrayList = intHolder;

		Set testSet = new Set(setArrayList);
		testSet.printFormatter();
		boolean hasIt = testSet.containsElement(8);
		System.out.println(hasIt);

		ArrayList<Integer> setArrayList2 = new ArrayList<Integer>(
				Arrays.asList(5, 9, 25, 14, 73, 40));

		Set testSet2 = new Set(setArrayList2);
		Set testUnionSet = union(testSet, testSet2);
		Set testIntSet = intersection(testSet, testSet2);

		testUnionSet.printFormatter();
		testIntSet.printFormatter();

		ArrayList<Integer> arl3 = new ArrayList<Integer>(Arrays.asList(4, 2,
				94, 39, 12));

		ArrayList<Integer> arl4 = new ArrayList<Integer>(Arrays.asList(4, 2,
				94, 12, 39));

		Set ts3 = new Set(arl3);
		Set ts4 = new Set(arl4);

		boolean isEqual = equals(ts3, ts4);
		System.out.println(isEqual);

	}

}
