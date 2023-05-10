package methodoverloading;

/*]
 * method Overloading-> when class have multiple method having
 * same name but different in parameter known as method
 * overloading
 * 1. position should be difference 
 * 2. parameter should be difference
 * 3. Types of argument should be difference
 */

public class emp2 {
	static void main()
	{
		System.out.println("zero parameter");
	}
	static void main(int a)
	{
		System.out.println("int paramter");
	}
	static void main(int a, double b)
	{
		System.out.println("int double parameter");
	}
	static void main(double b,int a)
	{
		System.out.println("double int parameter");
	}

	public static void main(String[] args) {
		emp2.main(78);
		emp2.main(56.3, 6);
		emp2.main(10, 20.0);
		

	}

}
