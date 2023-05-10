
public class MethodOverLoading {
	public void show()
	{
		System.out.println("1");
	}
	public void show(int a ,int b)
	{
		int res = a+b;
		System.out.println(res);
	}

	public static void main(String[] args) {
		
		MethodOverLoading m = new MethodOverLoading();
		m.show(10,20);
		m.show();
		NonStaticMethodExample1 s = new NonStaticMethodExample1();
		s.displayPersonalInfo();
		s.displayPersonalInfo("Ankit Singh","jaunpur");
		

	}

}
