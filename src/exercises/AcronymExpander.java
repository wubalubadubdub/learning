package exercises;

import java.util.Scanner;

public class AcronymExpander {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in); //reads the input stream 
		System.out.print("Enter a string: ");
		String ui = in.nextLine();
		expander(ui);
		
		
	}
	
	public static void expander (String ui) { 
		ui = ui.replace("lol", "laughing out loud");
		ui = ui.replace("dw", "don't worry"); 
		//etc

		System.out.println(ui);


		}

}
