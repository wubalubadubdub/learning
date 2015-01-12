package exercises;
import java.util.Scanner;
//Write a program that takes a string the user inputs and reverses it. The output should 
//look like: 
//Enter a string: abcdef
//The reverse of string "abcdef" is fedcba 


public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inStr; //string the user inputs 
		int inStrLen; //get the string length
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string: ");
		inStr = in.next(); //use next() to get the string the user enters
		//if the user enters a string with multiple words this will only get the first word
		inStrLen = inStr.length(); //use length() to get the string length
		
		//Use inStr.charAt(index) to extract character at index from inStr
		//a string of length n has indices n-1, n-2, ... , 0
		System.out.print("The reverse of string \"" + inStr + "\" is ");
		int index = inStrLen - 1; 
		while (index >= 0) {
			System.out.print(inStr.charAt(index));
			index--;
		}
		
	}

}
