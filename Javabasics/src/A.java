class Cons5
{
	void display(int a)
	{
		System.out.println("i am display() of Cons5");
	}
} 
class X{
	int j = 10;
	X()
	{
		System.out.println("Running class X Constructor");
	}
	void display()
	{
		System.out.println("i am display() of class X");
	}
public class A {
	int i =10;
	A(){
		System.out.println("Runnning class A constructor");
	}
	void display(double b)
	{
		System.out.println("i am display() of class A");
	}




	public static void main(String[] args) {
		
		Cons5 C = new Cons5();
		C.display(10);
	}

		
	}
				
	}

