// Prints the longest Palindrome in args array
// gives default statement if none found.

public class LongPalindrome
{
	public static void main(String[] args)
	{
		System.out.println(getLongestPalindrome(args));
	}
	private static String getLongestPalindrome(String[] sentence)
	{
		//return string containing longest palindrome
		String longest="";
		//iterate through every word in the sentence array
		for(String word : sentence)
		{
			// StringBuilder used for reversing the String  
			StringBuilder sb = new StringBuilder(word);
			// Test if each word is a palindrome && is longer than the return string
			if(word.length()>longest.length() && sb.reverse().toString().equalsIgnoreCase(word))
				longest=word;
		}
		if(longest.equals("")) {
			return "No Palindrome Found";
		}
		return longest;
	}
}