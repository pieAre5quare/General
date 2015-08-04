// Prints out the number of Triples that sum to 0.
// Tests the list of integers passed in args
import java.util.ArrayList;
public class TriplesSum {

	public static void main(String[] args) {
		if(args.length < 3) {
			System.out.println("At least 3 intergers are required");
		}
		ArrayList<Integer> nums = new ArrayList<Integer>();
		// Parse each String to an int
		// Prints out error if not an integer, does not stop running on error
		for(String arg: args) {
			try {
				nums.add(Integer.parseInt(arg));
			} catch (NumberFormatException e) {
				System.out.println(arg + "is not a parseable number");
			}
		}
		
	}

}
