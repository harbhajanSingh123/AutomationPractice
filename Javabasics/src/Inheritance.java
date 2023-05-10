
public class Inheritance {
	void display()
	{
		System.out.println("I am object of the inheritance");
	}
	

	public static void main(String[] args) {
		Cat n = new Cat();
		n.display2();
		n.display(); 
	}

}
class Cat extends Inheritance
{ 
	void display2()
	{
		System.out.println("I am a cat");
	}
}
