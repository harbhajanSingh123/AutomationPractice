
public class Z {
	Z()
	{
		System.out.println(" ia ma ");
	}
	Z( int a, double b)
	{
		 a=a+10;
		System.out.println("Print number of int a and double b : "+a+" ,"+b);
		a=a*2;
		System.out.println("Updated value of a is :"+a);
		
	}

	public static void main(String[] args) {
		Z A = new Z();
		Z B = new Z(4,4.5);
	
	}
	
}


