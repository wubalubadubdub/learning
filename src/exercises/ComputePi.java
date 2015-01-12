package exercises;
//Use the series expansion of pi, pi = 4*(1-1/3+1/5-1/7...) to compute the value of pi
//Decide on the termination criterion (e.g. number of terms used) using a parameter of the method



public class ComputePi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double piEstimate = 4*piCalc(1000000000L);
		System.out.println(piEstimate);
		
	}
	
	public static double piCalc(long n) {
		
		double i= 1; //counts which term in the portion (1-1/3+1/5...) we're at

		double sum = 0;
		//ith term in the series has value 2i-1
		//series terms alternate signs. the odd numbered (1st, 3rd, etc) terms in the series
		//produce + terms while even numbered terms give - terms
		while (i <= n) {
			if (i % 2 != 0) { //i is odd
				sum = sum + 1/(2*i-1);
				i++;
			}
			else { //i is even
				sum = sum -1/(2*i-1);
				i++;
			}
			
		}
		
		return sum;
		
		
	}

}

/* starts with i=1. i is odd so we get sum = 0+1 = 1. then for i = 2 we have i even, so 
 * sum = 1-1/3 = 2/3. then for i = 3 we have i odd, so sum = 1-1/3+1/5, and so on. 
 * with 100 million terms this takes about 3 seconds, with 1 billion terms about 30 seconds, 
 * and with 10 billion terms I assume it takes about 300 seconds or 5 minutes */
