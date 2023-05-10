
public class Overloadidng {
	void show() {
		System.out.println(" i am harbhajan singh");
	}
	void show(int a)
	{
		System.out.println(" i am int");
	}
	void show(int a, int b)
	{
		System.out.println(" i am int int type");
	}
	Overloadidng()
	{
		this(10);
		System.out.println("zero Parametrized constructor");
	}
	Overloadidng(int a)
	{
		
		System.out.println("Paramtetrized Constructor");
	}
	

	public static void main(String[] args) {
		Overloadidng A = new Overloadidng();
		A.show();
		A.show(10, 19);
		A.show(9);
		A.show('a');
		Overloadidng b = new Overloadidng();
		

	}

}
/*
method overloading==> method name are same 
                      method overloading are declard same class name
                      different types of parameter
                      1. no. of argument 
                      2. type of argument
                      3. Position of argument.
                      */
