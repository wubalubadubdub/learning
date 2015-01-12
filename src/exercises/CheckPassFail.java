package exercises;
import java.util.Scanner;
//Exercise CheckPassFail (if-else): Write a program called CheckPassFail which prints "PASS" 
//if the int variable "mark" is more than or equal to 50; or prints "FAIL" otherwise.

public class CheckPassFail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int mark;
		Scanner a = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		mark = a.nextInt();
		if (mark >= 50) {
			System.out.println("PASS");
			
		} else {
			System.out.println("FAIL");
		}
	}

}
