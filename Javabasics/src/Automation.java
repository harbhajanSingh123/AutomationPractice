
public class Automation {
	
	public void show(int a)
	{
		System.out.println("int method");
	}
	public void show(String a)
	{
		System.out.println("String method");
	}

	public static void main(String[] args) {
		Automation A = new Automation();
		A.show(15);
		A.show("Harbhajan singh");
		A.show('c');
		

	}

}
