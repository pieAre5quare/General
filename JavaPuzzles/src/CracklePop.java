
public class CracklePop {
	//number CracklePop will end on
	public static final int END_NUMBER = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 1;
		do {
			System.out.println(checkCount(count));
			count++;
		} while (count < 100);
	}
	
	//check if count is divisible by 3 and/or 5
	//returns appropriate String 
	public static String checkCount(Integer count) {
	
		if(count % 3 == 0 && count % 5 == 0) {
			return "CracklePop";
		} else if(count % 5 == 0) {
			return "Pop";
		} else if(count % 3 == 0 ) {
			return "Crackle";
		} else {
			return count.toString();
		}
		
	}
}
