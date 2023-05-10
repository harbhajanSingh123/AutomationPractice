package exceptionhandling;

public class ExceptionHandlingExam1 {

	public static void main(String[] args) {
		System.out.println(	" Program Starts");
		int a= 10;
	
		int b = 0;
		int c;
		try {
			c=a/b;
			System.out.println(c);
		}catch (ArithmeticException obj)
		{
			System.out.println("Exceptionhandled:"+ obj);
			obj.printStackTrace();
			System.out.println("Exception handled");
			
		}
		System.out.println("programs End");	

	}
}
