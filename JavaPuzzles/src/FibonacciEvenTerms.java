// Project Euler problem 1 
// https://projecteuler.net/problem=2
public class FibonacciEvenTerms {
	public static final int UPPER_BOUND = 4000000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;
		
		int fibNumber1 = 1;
		int fibNumber2 = 1;
		while(fibNumber2 <= UPPER_BOUND){
			if(fibNumber2 % 2 == 0) {
				total += fibNumber2;
			}
			int temp = fibNumber1 + fibNumber2;
			fibNumber1 = fibNumber2;
			fibNumber2 = temp;
		}
		System.out.println(total);
	}

}
