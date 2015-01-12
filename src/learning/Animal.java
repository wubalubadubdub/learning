package learning;

//classes are organized collections of variables(fields) and methods(functions)
//Animal is the base class. the subclasses of Animal are types of animals and all have 
//behaviors in common with the superclass Animal, as well as their behaviors specific to 
//their class 
public class Animal implements AnimalBehaviors{
//write fields common to all animals

	
	
//make a constructor for an animal
public Animal (String size) { //sizes small, med, or large
	
}



	
	public class Cat extends Animal implements AnimalBehaviors {
		//cat-specific fields
		boolean purrsAlot;
		boolean goodKitty;
			
			public Cat(String size, boolean purrsAlot) {
				super(size); //the size parameter comes from the superclass Animal. we 
				//must state this explicitly
				System.out.println("A cat was born!");
				
			}
			
			public void spray(String name, boolean isBeingAnnoying) {
				if(isBeingAnnoying) {
					System.out.println(name + " got sprayed! It's super effective!");
					
				}
			}
			
			public void eat(){
				System.out.println("The kitty eats!");
			}
			
			
	
				
			
		
	}
	
	
	public static class Dog extends Animal { //we can create instances of a static class
		//without create an instance of its superclass 
		//write dog-specific fields
		boolean barkAlot;
		boolean isAGoodDog; //both false by default
		
		public Dog(String size, boolean barksAlot, boolean isAGoodDog) {
			super(size); 
			System.out.println("A dog was born!");
		}
			
		public void giveDogTreat(String name, boolean isAGoodDog) {
			if (isAGoodDog) {
				System.out.println(name + " gets a dog treat!");
			}
			else {
				System.out.println("No treat for " + name + " this time");
			}
		}
		
	}
	
	public static class Fish extends Animal {
		String coolness; //putting field here allows methods in class to use it
		public Fish(String size, boolean livesinBowl, String bowlColor) {
			super(size);
			System.out.println("A fish was born!");
			
		}
		
		public String detCoolness(String bowlColor) {
			
			switch(bowlColor) {
			
			case "blue": coolness = "10";	
						 return coolness;
			case "red" : coolness = "9";
						 return coolness;
			case "green" : coolness = "8";
						 return coolness;
			default: coolness = "What the shit?";
					return coolness;
			
			}
		}
			
		public void printCoolness() {
			System.out.println(coolness);
		}
		
		
		
		
			 
		
	}
	
	



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal cat1 = new Animal("med");  //cat1 is an instance of animal
		Cat Rocko = cat1.new Cat("med", true); //Rocko is an instance of Cat
		//when a subclass is "static" it can act as an independent class within a class
		//because Cat as declared is a non-static subclass of Animal, we can't create a cat
		//without first creating an animal. the above two objects are created using the 
		//default constructor
		
		Rocko.spray("Rocko", true);
		
		
		//because the class "Dog" has the static modifier, we can create a dog object without
		//creating an animal object first
		Animal.Dog Lola = new Animal.Dog("small", true, true);  //could also be just Dog Lola = new Dog();
		//made a dog named Lola who barks a lot but is still a good dog :p
		Lola.giveDogTreat("Lola", true); //will give Lola a treat since she's a good dog!
		
		Animal.Fish Zeus = new Animal.Fish("small", true, "blue");
		Zeus.detCoolness("yellow");
		Zeus.printCoolness();
		
		
	}





	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}





	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		
	}





	@Override
	public void poop() {
		// TODO Auto-generated method stub
		
	}





	@Override
	public void mate() {
		// TODO Auto-generated method stub
		
	}
	
}
	
		
		
		
	


