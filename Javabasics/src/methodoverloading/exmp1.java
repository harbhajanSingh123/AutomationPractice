package methodoverloading;

public class exmp1 {

	public  void mian()
	{
		System.out.println("i am zero parameterized method");
		
	}
	void mian(int a)
	{
		System.out.println("i am int parametrized constructor");
		
	}
	void mian(int a, double b)
	{
		System.out.println("i am int and double parametrized constructor");
		
	}
	

	public static void main(String[] args) {
		exmp1 e = new exmp1();
		e.mian(0);
		e.mian(10, 10.0);
		e.mian();
	
		
		

	}

}
