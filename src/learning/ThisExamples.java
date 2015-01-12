package learning;

public class ThisExamples {
	
	int var = 5;
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisExamples t = new ThisExamples();
		t.print(); 
		
		t.method2();

	}
	
	public void print() {
		//this.var refers to the instance variable var, which equals 5
		//var refers to the local variable var, which equals 10
		int var = 10;
		System.out.println("Value of instance variable: " + this.var ); //prints 5
		System.out.println("Value of local variable: " + var); //prints 10
	}
	
	public void method1() {
		System.out.println("Method1 called");
	}
	
	public void method2() {
		System.out.println("Method2 called");
		this.method1(); //used to call method1 from inside method2. this refers to the object 
		//that method2 is called on
	}

}

