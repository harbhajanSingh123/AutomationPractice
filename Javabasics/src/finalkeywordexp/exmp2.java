package finalkeywordexp;
class A
{
	int a= 10;

	/*
	final */void main() {
		System.out.println(" i am class A object");
	}
}

public class exmp2 extends A{
	int c = 70;
	void main()
	
	{
		System.out.println("i am class  B object");
	System.out.println(super.a);
	System.out.println(this.c);
	super.main();
		
	}

	public static void main(String[] args) {
		exmp2 e = new exmp2();
		e.main();
		e.main();
	
		
	

	}

}
