package abstractionExample;

public class Vehicle {

	public static void main(String[] args) {
	Car c = new Car();
	c.main();
	c.main1();
	Bike b = new Bike();
	b.main();
	b.main1();

	}

}
abstract class Vehicle1
{
	abstract void main();
	abstract void main1();
	
}    
class Car extends Vehicle1
{
	 void main()
	{
		System.out.println("Car: is key");
	}
	void main1()
	{
		System.out.println("car is start anywhere");
	}
}
class Bike extends Vehicle1
{
	void main()
	{
		System.out.println("Bike: is start by Kick");
	}
	void main1()
	{
		System.out.println("bike is start any where ");
	}
}
