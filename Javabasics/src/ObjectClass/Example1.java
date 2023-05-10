package ObjectClass;

class Demo123
{
	void display()
	{
		System.out.println("i am display() of class Demo123");
	}
}

public class Example1 extends Demo123 {
	static int last_roll = 100;
	int roll_no;
	Example1()
	{
		roll_no = last_roll;
		last_roll++;
	}
	
	
	void display()
	{
		System.out.println(" i am display of class() of class object2");
	}
	public int hashcode()
	{
		return roll_no;
	}
	public String toString()
	{
		return "a" ;
	}
	

	public static void main(String[] args) {
      Example1 s = new Example1();
      System.out.println(s);
      System.out.println(s.toString());
      Example1 E = new  Example1();
      System.out.println(E);
      System.out.println(E.toString());
      System.out.println(E.hashcode());
      System.out.println(E.hashcode());
      
      Demo123 D = new Demo123();
      System.out.println(D);
      System.out.println(D.toString());
      System.out.println(D.hashCode());
	
	}

}
