package learning;

public class OuterClass {

	/*
	 * A static nested class does NOT have access to other (non-static) members
	 * (fields and methods) of the enclosing class. It can only use them through
	 * an object reference, e.g. OuterClass.varName Static nested classes are
	 * accessed using the enclosing class name, e.g.
	 * OuterClass.StaticNestedClass To create an object for the static nested
	 * class, use this syntax: Outerclass.StaticNestedClass nestedObject = new
	 * OuterClass.StaticNestedClass(); Can be declared public, private,
	 * protected, or package private, unlike an outer class, which can only be
	 * public or private It thus behaves as a top-level class nested inside
	 * another top-level class for packaging convenience
	 */

	public static class StaticNestedClass {

		// add code here later that shows the difference between this and an
		// inner class

	}

	/*
	 * Non-static nested classes are called "inner classes". These can access
	 * members of the enclosing class, even if they are declared private. An
	 * inner class is associated with an instance of its enclosing class and
	 * cannot define any static members itself. To instantiate (create an
	 * instance of) an inner class, you must first instantiate its outer class, 
	 * e.g. with OuterClass outerObject = new OuterClass;
	 * Then, create the inner object within the outer object with this syntax:
	 * OuterClass.InnerClass innerObject = outerObject.new InnerClass(); There
	 * are two special types of inner class: local classes and anonymous classes
	 */

	public class InnerClass {

		// add code here later that shows the difference between this and a
		// static nested class
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
