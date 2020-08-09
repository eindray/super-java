public class Summation {
	
	static int [] valueArray = {1,2,3,4,5};
	
	public static void main(String args[]) {
		int sum = 0;
		
		for (int value: valueArray) {
			sum += value;
		}
	       System.out.print(sum);
	}

}