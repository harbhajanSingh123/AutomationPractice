class Test1
{
	void dipslay()
	{
		System.out.println("i am harbhajan singh ");
	}
}
public class Overiiding extends Test1 {
	void display()
	{
		
		System.out.println(" i am ankit singh ");
		super.dipslay();
	}

	public static void main(String[] args) {
		// Test1 t = new  Test1();
		 //t.dipslay();
		 Overiiding o = new Overiiding();
		 o.display();
/*
 * overriding -> Declaring a method in subclass which is already 
 * present in parent class known as method overriding 
 
 *  
 * 
 */
		 
		 
		
		

	}

}
