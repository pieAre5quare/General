// Solves a given factorial using recursion 
public class Factorial
{
	public static void main(String [] args)
	{
		System.out.println(factorial(Integer.parseInt(args[0])));
	}
	// n!
	private static int factorial(int n)
	{
		// return variable that accumulates factorial sum
		int total = 1;
		
		// end case
		if(n==0 || n==1) return total;
		// continues calling itself until end case found
		else total = n*factorial(n-1);
		return total;
	}
}