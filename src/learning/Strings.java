package learning;

/* Strings are objects from the class java.lang.String, which extends java.lang.Object.
 * All string literals, such as "abc", are instances of this class. 
 * Strings are immutable--but their references are not. more about that below. 
 * A String is an array of characters. String str = "abc" is equivalent to: 
 * char[] data = {'a', 'b', 'c'}, String str = new String(data)
 * The class String includes methods for examining individual characters of the sequence, 
 * for comparing strings, for searching strings, for extracting substrings, and for creating a 
 * copy of a string with all characters translated to uppercase or to lowercase. Case mapping is based 
 * on the Unicode Standard version specified by the Character class.

   The Java language provides special support for the string concatenation operator ( + ), and for conversion of other objects to strings. 
   String concatenation is implemented through the StringBuilder(or StringBuffer) class and its append method. String conversions are implemented
    through the method toString, defined by Object and inherited by all classes in Java. 
    Unless otherwise noted, passing a null argument to a constructor or method in this class will cause a NullPointerException to be thrown.
 */

public class Strings {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "abc"; //creates a String "knowledge" and assigns it a reference of str
		String s = str; //assigns a new reference to the same string "knowledge"
		//both str and s now point to the same String--"knowledge"
		str = str.concat(" base");
		/*what we changed is what str refers to. instead of referring to "knowledge", 
		 * str now refers to "knowledge base". had it not been for another reference, s, that points
		 * to the String "knowledge", it would've been lost the JRE garbage collector
		 */
		
		
		
		}
		

}
