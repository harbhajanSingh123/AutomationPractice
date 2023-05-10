
// OVERRIDING TOSTRING METHOD AND HASHCOE METHOD

package ObjectClass;
 
class Demo12
{
	void display()
	{
		System.out.println(" i am object of demo12 class");
	}
}
public class Example2 {
	static int last_roll = 100;
	int roll_no;
	// CONSTRUCTOR*******************************
	Example2()
	{
		roll_no = last_roll;
		last_roll++;
	}
	// OVERRIDE HASHCODE METHOD************************
	public int hashcode()
	{
		return last_roll;
		
	}
	// OVERRIDE TOSTRING METHOD************
	public String toString()
	{
		return "Basic Core Java";
	}
	

	public static void main(String[] args) {
		Example2 E = new Example2();
		System.out.println(E);
		System.out.println(E.toString());
		System.out.println(E.hashcode());
		
		Demo12 d = new Demo12();
		d.display();
		System.out.println(d);
		System.out.println(d.toString());
		System.out.println(d.hashCode());
		System.out.println(d.toString());

	}

}
