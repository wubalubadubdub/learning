package learning;

import learning.ThisKeyword.SecondThisUsage.Student2;

public class ThisKeyword {
/*the following code gives the undesired output "0 null 0 null" because there is ambiguity 
between the instance variables id and name in the constructor and the parameters that the 
constructor takes, which are also named id and name. the program prints the default values 
from where they were declared as class variables: 0 for an int and null for a string
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student (111,"Karan");  
	    Student s2 = new Student (321,"Aryan");  
	    s1.display();  
	    s2.display(); 

	}
	
	public static class Student {
		int id;
		String name;
		
		Student(int id, String name) {
			id = id;
			name = name;
		}
		
		void display(){
			System.out.println(id+" "+name);
			}  
		
		 
	} */
	
	//this ambiguity is resolved by using the "this" keyword as shown below
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student (111,"Karan");  
	    Student s2 = new Student (321,"Aryan");  
	    s1.display();  
	    s2.display(); 

	} 
	
	public static class Student {
		int id;
		String name;
		
		Student(int id, String name) {
			this.id = id;  //assigns the id used when the student is constructed 
			//to the variable id. "this" is a reference variable that refers to the
			//current object
			this.name = name;
		}
		
		void display(){
			System.out.println(id+" "+name);
			}  
		
		 
	} */ 
	//this can also be used for constructor chaining, as shown below
	public static class SecondThisUsage {
		
		public static class Student2 {
			int id;
			String name;
			String city;
			
			Student2(int id, String name) {
				this.id = id; //this.id is the instance variable 
				this.name = name;
			}
			
			Student2(int id, String name, String city) {
				this(id,name); //don't need to initialize id and name now
				//must be the first statement in the constructor or compile time error occurs!
				this.city = city;
			}
			
			void display(){
				System.out.println(id+" "+name+" "+city);}  
			}
		      
		      
		}
	

	public static void main(String args[]){  
    Student2 e1 = new Student2(111,"karan");  
    Student2 e2 = new Student2(222,"Aryan","delhi");  
    e1.display();  
    e2.display();
	}
} 
