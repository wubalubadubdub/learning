package learning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
//comparators can be passed to a sort method (Collection.sort or Arrays.sort) to allow 
//precise control over the sort order
//the goal in this file is to design a comparator that sorts a list of numbers in descending order
import java.util.List;

class Dog implements Comparator<Dog>, Comparable<Dog>{
	   private String name;
	   private int age;
	   Dog(){
	   }

	   Dog(String n, int a){
	      name = n;
	      age = a;
	   }

	   public String getDogName(){
	      return name;
	   }

	   public int getDogAge(){
	      return age;
	   }

	   // Overriding the compareTo method
	   public int compareTo(Dog d){  
	      //return (this.name).compareTo(d.name);  //this would sort the names alphabetically
		   return 0;
		   
	   }

	   // Overriding the compare method to sort the age 
	   public int compare(Dog d, Dog d1){
	      return d1.age - d.age;  //the returns the difference in values so that the comparator will sort by descending age
	      //if the 2nd dog d1 is older than the 1st d, this returns a + int and dog d1 will appear in the list before dog d
	      
	      //note: if we used d.age - d1.age the result would be a - int and then dog d1 would appear in the list after dog d
	      
	   }
	}

public class Example{

   public static void main(String args[]){
      // Takes a list of Dog objects
      List<Dog> list = new ArrayList<Dog>();

      list.add(new Dog("Shaggy",3));
      list.add(new Dog("Lacy",2));
      list.add(new Dog("Roger",10));
      list.add(new Dog("Tommy",4));
      list.add(new Dog("Tammy",1));
      //Collections.sort(list);// Sorts the array list

      for(Dog a: list)//printing the sorted list of names
         System.out.print(a.getDogName() + ", ");

      // Sorts the array list using comparator
      Collections.sort(list, new Dog()); //the comparator is the new Dog() part
      System.out.println(" ");
      for(Dog a: list)//printing the sorted list of ages
         System.out.print(a.getDogName() +"  : "+
		 a.getDogAge() + ", "); 
       
      List<Person> l = new ArrayList<Person>(); 
      l.add(new Person(23));
      l.add(new Person(45));
      l.add(new Person(14));
      l.add(new Person(72));
      Collections.sort(l, new Person()); //sort the array list using the comparator
      System.out.println("");
      for (Person p: l)
    	  System.out.println(p.getAge());
    	  
   }
   
   
}

class Person implements Comparator<Person>, Comparable<Person>{ //for Comparator<> either a known type like Integer or a class name must go in the <>
	//this class implements methods to sort a collection of people based on their ages using a custom comparator
	private int age;
	
	Person() {
		
	}
	
	Person(int age) {
		this.age = age;
	}
	

	@Override
	public int compareTo(Person p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int compare(Person p1, Person p2) {
		// TODO Auto-generated method stub
		return p2.age - p1.age;
	}
	
	public int getAge() {
		return age;
	}
	
	
	
}