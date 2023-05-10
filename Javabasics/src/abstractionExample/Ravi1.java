package abstractionExample;

/*
 * Abstraction-> Hiding internal details and showing its
 * functionality known as abstraction 
 * There are two ways to achieve abstraction 
 * 1. By Abstract Class 
 * 2. By Interface
 * 
 * Abstract Class-> Any class Start with abstract keyword  
 * known as abstract class 
 * -> Abstract  class method does not have body 
 * -> when any class inherit the property and behavior of
 * abstract class then the inherit class provide abstract
 * method body 
 * -> Abstract method can't be instantiate which means we can not
 * create the object of abstract method  
 *
 */

abstract class Akash1
{
	abstract void main();
	 
	
	
}
class Akash2 extends Akash1
{

	void main()
	{
		System.out.println(" i am Akash singh ");
	}
}

public class Ravi1 extends Akash1{
	void main()
	{
		System.out.println(" i ma xyz");
	}


	
	public static void main(String[] args) {
	Akash2 A = new Akash2();
	A.main();
	Ravi1 r = new Ravi1();
	r.main();
	Aman a = new Aman();
	a.main();

	}

}
class Aman extends Akash1
{
	void main()
	{
		System.out.println(" i am brother of abstrcat class of Akash1");
	}
}
