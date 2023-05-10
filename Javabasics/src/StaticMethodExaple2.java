
public class StaticMethodExaple2 {

	public static void main(String[] args) {
		
		addTwoNumber(25,50);
		int res = multiplyTwoNumber(10,20);
		System.out.println("Result"+res);
		int finalValue = res+100;
		System.out.println("Updated Final value is : "+finalValue);
	
		

	}
	
	public static int multiplyTwoNumber(int num1,int num2)
	{
		System.out.println("Number1: "+num1);
		System.out.println("Number2:"+ num2);
		int res = num1*num2;
		return res;
	}
	public static void addTwoNumber(int num1,int num2)
	
	{
		System.out.println("Number1:"+num1);
		System.out.println("Number2:"+num2);
		int res = num1+num2;
		System.out.println("Result is : "+res);
		
		
	}

}
