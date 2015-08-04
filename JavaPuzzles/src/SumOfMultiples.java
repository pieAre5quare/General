// Project Euler problem 1 
// https://projecteuler.net/problem=1
public class SumOfMultiples {
	private static final int MULTIPLE1 = 3;
	private static final int MULTIPLE2 = 5;
	private static final int UPPER_BOUND = 1000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int total = 0;
		for(int i = 1; i < UPPER_BOUND; i++) {
			if(i % MULTIPLE1 == 0 || i % MULTIPLE2 ==0) {
				total += i;
			} 
		}
		System.out.print(total);
	}

}
