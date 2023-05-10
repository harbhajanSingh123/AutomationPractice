package inheritanceexample;
class Two{
	void method()
	{
		System.out.println(" i am method of two ");
	}
}
class One{
	
	void method()
	{
		System.out.println("i am harbhajn singh");
	}
	void method2()
	{
		System.out.println(" i am method2");
	}
	
}
public class Exam1 extends One{
	void method1()
	{
		
		System.out.println(" i am ankit singh");
	}
	public static void main(String[] args) {
		Exam1 e = new Exam1();
		e.method1();
		e.method();
		One o = new One();
		o.method();
	}
}
// inheritance-> when one object inherit the properties and behavior
//the parent class known as inheritance 

