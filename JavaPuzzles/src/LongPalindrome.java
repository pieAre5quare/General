public class LongPalindrome
{
	// prints out longest palindrome in args array
	public static void main(String [] args)
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
			if(word.length()>longest.length() && sb.reverse().toString().equals(word))
				//assign longest
				longest=word;
		}
		return longest;
	}
}