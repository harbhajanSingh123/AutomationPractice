
public class C {
	double i;
	C(double j)
	{
		System.out.println("Running class c constructor");
		i=j;
	}

	public static void main(String[] args) {
		C b1 = new C(25.34);
		System.out.println(b1.i);
		b1.i = 14.65;
		System.out.println(b1.i);

	}

}
