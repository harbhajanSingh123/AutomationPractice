
public class SwapTwoNum {

	public static void main(String[] args) {
	
		int a = 10;
		int b = 20;
		System.out.println("A is: "+a);
		System.out.println("B is: "+b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("*******************");
		System.out.println("After Swapping");
		System.out.println("update value of A = "+a);
		System.out.println("update value of B = "+b);

	}
}


