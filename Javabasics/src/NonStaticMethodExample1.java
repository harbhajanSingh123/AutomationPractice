
public class NonStaticMethodExample1 {

	public static void main(String[] args) {
		NonStaticMethodExample1 s = new NonStaticMethodExample1();
		s.displayPersonalInfo();
		s.displayPersonalInfo("Ankit Singh","jaunpur");	
	}
	public void displayPersonalInfo()
	{
		System.out.println("Hii i am shailesh");
		System.out.println("i am your automation trainer");
		System.out.println("i am form up");
	}
	public void displayPersonalInfo(String name,String address)
	{
		System.out.println("i am "+name);
		System.out.println("i am from"+address);
	}
}
