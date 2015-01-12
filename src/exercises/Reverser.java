package exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Reverser {
	
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(true) {
		System.out.println("Enter the string to be reversed: ");
		String orig = in.nextLine();
		
		//the boundary between words will be the whitespace in the input string
		String[] splitString = orig.split("\\s+"); //splits the input string everywhere 
		//there's a space and puts each word into an array
		
		
		
		
		
		for(int i = ((splitString.length)-1); i >= 0; i--) { //print the string backwards starting with the highest index
		System.out.print(Arrays.asList(splitString).get(i) + " "); //print out each word, starting with index splitString.length - 1
		}
		System.out.println("Enter another?");
		
		}
	}

}
