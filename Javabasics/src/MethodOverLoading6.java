
public class MethodOverLoading6 {
	int a;
	public void my(int a,int b, double c)
	{
		System.out.println("this is the int-int and double method");
	}
	public void my(int a)
	{
		System.out.println("i am mehtod overloading");
	}
	public void name(int a,String b,char c)
	{
		System.out.println("this is the int-string and char method body");
	}
	public void three()
	{
		System.out.println("i am your automation class teacher that its about me ");
		
	}
	public void america(int a)
	{
		System.out.println("I am going to america that why i am going ");
	
	}

	public static void main(String[] args) {
		MethodOverLoading6 r = new MethodOverLoading6();
		r.america(10);
		r.three();
		r.my(10, 20, 33.5);
		r.name(10, "bus", 'c');
		r.my(20);

	}
	/*
	 * Method Overloading->
	 * method overloading have the one class with multiple method having 
	 * same name are called method overloading;
	 * 
	 * Constructor->
	 * Constructor are block having same name of that of class name
	 * it is only applicable for constructor are public private protected 
	 * and default
	 *  
	 */

}
