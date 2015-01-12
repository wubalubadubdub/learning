package exercises;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PrintNumberInWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 0;
		Scanner a = new Scanner(System.in);
		System.out.println("Enter an integer between -2^31 and 2^(31)-1: ");
		try {
			num = a.nextInt();
		} catch (InputMismatchException e) {
			System.out.print(e.getMessage());
			
			
		}
		
		/*method 1: if else-if else statements
		if (num == 1) {
			System.out.println("One");
		}
		
		else if (num == 2) {
			System.out.println("Two");
		}
		
		else if (num == 9) {
			System.out.println("Nine");
		}
		
		else {
			System.out.println("Other");
		} */
		
		//method 2: switch 
		
		switch(num) {
		case 1: System.out.println("One");
				break;
		case 2: System.out.println("Two");
				break;
		case 9: System.out.println("Nine");
				break;
		default:System.out.println("Other"); 
				break;
			}
		
		
	}

}
