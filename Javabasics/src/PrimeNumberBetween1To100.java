
public class PrimeNumberBetween1To100 {

	public static void main(String[] args) {
		

		for (int num = 1; num <= 100; num++) {
			int temp = 0;
			for (int i = 1; i <=num ; i++) {
				
				if (num % i == 0) {
					temp = temp + 1;
				}
			}
			if (temp == 2) {
				System.out.print(num + " ");

			}

		}

	}
}
