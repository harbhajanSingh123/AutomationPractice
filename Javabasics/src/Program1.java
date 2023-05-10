
public class Program1 {
	String a ="Ankit";
	int b = 10;
	public static void  name()
	{
		System.out.println("i am harbhajan singh");
	}
	public  Program1(String a, int b)
	{
		a = a;
		b = b;
		System.out.println(b);
		System.out.println(this.b);
		System.out.println(this.a);	
	}

	public Program1() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
	
		name();
		 Program1 r = new Program1("harbhajan",78);
	}

}

