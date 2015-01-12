package exercises;


public class Math {
	
	
	public static void main(String[] args) { 
		System.out.println("The sum is " + sum(111, 8899));
		System.out.println("The average is " + average(111, 8899));
		int res = factorial(5);
		System.out.println("5! is equal to " +res);
		
	}
	
	public static int sum(int i, int n) { //methods should be static when it makes sense
		//to call them without having created an object first, like with the sum and average fns
		//i and n are parameters of type int and are initialized when the method is called
		// TODO Auto-generated method stub
		
		int val = 0;
		while (i <= n) {
			val = val + i;
			i++;
		}
		return val;
	}
	
	public static float average(float i, float n) {
		float avg = (i+n)/2;
		return avg;
	}
	
	public static int factorial(int n) {
		int val = 1;
		while (n > 1) {
			val = n * val;
			n--;
		}
		return val;
		
	}
	
	

}
