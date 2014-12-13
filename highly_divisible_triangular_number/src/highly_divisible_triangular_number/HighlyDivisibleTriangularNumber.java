package highly_divisible_triangular_number;

public class HighlyDivisibleTriangularNumber {
	
	private static int getNumberOfDivisors(long num) {
		int numDivisors = 0;
		
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				numDivisors++;
			}
		}
		
		return numDivisors;
	}
	
	private static long getTriangularNumber(long num) {
		return ((num) * (num +1L))/2;
	}

	public static void main(String[] args) {
		long num = 1L;
		long triangularNum;
		int numDivisors;
		
		while(true) {
			triangularNum = getTriangularNumber(num);
			numDivisors = getNumberOfDivisors(triangularNum);
			
			if (numDivisors > 500L) {
				System.out.println(triangularNum);
				break;
			}
			
			num++;
		}
	}

}
