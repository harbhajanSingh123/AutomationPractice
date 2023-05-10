
public class NonStaticMethodExample2 {

	public static void main(String[] args) {
		NonStaticMethodExample2 n1 = new NonStaticMethodExample2();
		n1.Add(2, 2);
		
	

	}
	
	public void Add( int num1,int num2)
	{
		int c;


		System.out.println("Enter First number :"+num1);
		System.out.println("Enter Second number :"+ num2);
		c = num1+num2;
		System.out.println("add two numbers :"+c);
		
		
	}

}
