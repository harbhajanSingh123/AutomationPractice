
public class StaticMethodExample3 {

	public static void main(String[] args) {
		// WAP to Swap To Number Withought Using Third Variable
		SwapTwoNum(10,20);
		
		

	}
	public static void SwapTwoNum(int num1,int num2)
	{
		System.out.println("Number1 :"+num1);
		System.out.println("Number2 :"+num2);
		
		// Appling Swaping Method.
		
		num1 = num1+num2;
		num2 = num1-num2;
		num1 = num1-num2;
		System.out.println("After Swap number1:"+num1);
		System.out.println("After Swap number2:"+num2);
	}
	public static char getAschiValue(char c)
	{
		return c;
		
		
	}

}
