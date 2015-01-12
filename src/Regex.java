import java.util.Arrays;
import java.util.List;

public class Regex {
	public static final String EXAMPLE_STRING = "5ga*";

	// + "is my small example "
	// + "string which I'm going to " + "use for pattern matching.";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// regexes are string literals so they need to be in quotes ""
		// \\w followed by n dots returns true if the string consists of a first
		// character letter or number followed by n of any other char.
		// \\w\\w.. would return true if the first two chars. were letters or
		// numbers and they were followed by 2 of any other char. for example
		// the asterisk * means "occurs at least 0 times". so ".*" returns true
		// for any character sequence because every string contains
		// "any character that appears at least 0 times"

		// characters can also be grouped in brackets. for example, "[abc]+"
		// returns true if either a,b, or c occurs at least once
		List<String> strList = Arrays.asList("goose", "zebra", "porpoise",
				"walrus");

		for (String s : strList) {

			if (s.matches(".*e.*")) { // if the String s contains an e
				System.out.println("Contains an e: " + s); // prints goose,
															// zebra, and
															// porpoise

			}

		}
		
		
	}

}
