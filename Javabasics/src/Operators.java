
public class Operators {

	public static void main(String[] args) {
		/*
		int a = 10, b = 20;
		boolean c = (a <= b);
		System.out.println(c);
		c = (a>=b);
		System.out.println(c);
		c = a==b;
		System.out.println(c);
		c = a!=b;
		System.out.println(c);
		
		
		int num1=30;
		int num2=30;
		boolean b1 = (num1==num2);
		boolean b2 = (num1>=num2);
	
		System.out.println("b1 && b2="+(b1 && b2 ));
		System.out.println("b1 && b2="+(b2 ));
		System.out.println(b1 || b2);
		System.out.println(b1 !=b2);

		boolean b1 = true;
		boolean b2 = false;
		System.out.println("b1&&b2="+(b1 && b2));
		System.out.println("b1 || b2="+(b1 || b2));
		System.out.println("b1 !=b2"+!(b1 && b2));
*/

		int num1 = -5; int num2 = -5;
		System.out.println("Bool1 && bool2:"+((num1 == num2)&&(num1>num2)));
		
		System.out.println("Bool1 || bool2:"+((num1 == num2)||(num1>num2)));
		System.out.println("!(Bool1 && bool2):"+(!(num1==num2)&&(num1>num2)));
	}

}
