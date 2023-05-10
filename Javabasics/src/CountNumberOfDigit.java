
public class CountNumberOfDigit {

	public static void main(String[] args) {
		int num = 24747474;
		int count = 0;
		while(num>0)
		{
			num = num/10;
			count++;
		}
		System.out.println("Count number of Digit ="+count);

	}

}

