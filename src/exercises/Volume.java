package exercises;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.lang.Math;

public class Volume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a volume in cubic meters. The output will be the dimensions"
				+ "\nof a figure that produces that volume");
		
		
			//validate user input 
			while (!in.hasNextDouble()) { //while the user input is not a double
				System.out.println("That's not a number ya dingus!");
				System.out.println("Enter a volume in cubic meters: ");
				in.next(); // keep getting the next thing user enters until it
							// matches. then in.hasNext will be true and we'll exit the while loop
				// the type we want (double in this case)
			}
		

		double ui = in.nextDouble(); // get the number the user enters
										// as a double

		// create variables for the dimensions
		double s = Math.cbrt(ui); // side length for the cube
		double rCyl = Math.cbrt((ui / Math.PI)); // radius of a cylinder
													// whose height
													// equals its radius
		double rSph = Math.cbrt(0.75 * 1 / Math.PI * ui); // radius of
															// sphere
		double rCon = Math.cbrt(3 * ui * 1 / Math.PI); // radius of cone
														// whose height
														// equals its
														// radius
		//round off doubles to 2 decimal places
		String[] dimArray = {"m side length for a cube", "m radius for a cylinder", 
				"m radius for a sphere", "m radius for a cone"};
		
		
		
		double[] varArray = {s, rCyl, rSph, rCon};
		for(int i = 0; i < 4; i++) {
			//format doubles to be rounded to 2 places and add the appropriate dimensional endings
			String formattedD = new DecimalFormat("#.##").format(varArray[i]) + dimArray[i];
			
			
			
			System.out.println(formattedD);
		}
		
		System.out.println("Note: for cylinder and cone it's assumed that radius = height");
		
		
		
	}
	
	

}
