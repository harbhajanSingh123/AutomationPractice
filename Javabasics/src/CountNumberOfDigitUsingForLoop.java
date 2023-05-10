
public class CountNumberOfDigitUsingForLoop {

	public static void main(String[] args) {
		int count =  0;
		for(int num = 46777777; num>=0; num--)
		{
			num = num/10;
			count++;
			
		}
		System.out.println("Count Number Of Digit = "+count);

	}

}
