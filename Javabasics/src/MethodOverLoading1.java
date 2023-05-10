
public class MethodOverLoading1 {
	public void abc()
	{
		System.out.println("Non Static method");
	}
	public void abc(int a, double b)
	{
		double c =a+b;
		System.out.println("Non Static method is :"+c);
	}
	public static void add()
	{
		int num1=2,num2=3;
		int res = num1*num2;
		System.out.println("The result is :"+res);
		
	}
	public static void add(double f)
	{
		System.out.println("the result of "+f);
	}
	
	public static void add(int a,float b)
	{
		double c = a+b;
		
		System.out.println("the value of :"+c);
	}
	public static void add(float a,int b)
	{
		double c= a*b;
		System.out.println("The value of c is :"+c);
	}

	public static void main(String[] args) {
		MethodOverLoading1.add();
		MethodOverLoading1.add(25.6);
		MethodOverLoading1.add(4 ,10.0f);
		MethodOverLoading1.add(11.1f, 0);
		MethodOverLoading1 m = new MethodOverLoading1();
		m.abc();
		m.abc(12, 1.5);

	}

}
