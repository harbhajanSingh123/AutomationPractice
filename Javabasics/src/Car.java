
public class Car {
	void run()
	{
		System.out.println("I have four tyres");
	}
	
	public static void main(String[] args) {
		Car C = new Car();
		C.run();
		Bike B = new Bike();
		B.display();
	}
}
class Bike{
	void display()
	{
		System.out.println(" i have two tyres");
	}
}
abstract class Vehicle
{
	abstract void run();
	abstract void display();
}
