
public class ThisKeyWord12 {
	void methodone()
	{
		System.out.println("Inside Method One");
	}
	void methodtwo()
	{
		System.out.println("inside Method Two");
		this.methodone();
	}

	public static void main(String[] args) {
		ThisKeyWord12 obj = new ThisKeyWord12();
		obj.methodtwo();
		Testa t = new Testa();
		t.n();
		

	}

}
class Testa
{
	void m()
	{
		System.out.println("hellow m");
		System.out.println(" i am hero of the bath");
		
	}
	void n()
	{
		this.m();
		System.out.println("hellow n");
		this.m();
		
		
	}
}
