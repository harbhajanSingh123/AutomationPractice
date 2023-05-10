
public class Inheritance1 {
	public String model;
	public String color;
	public int price;
	 Inheritance1(String model,String color,int price) // Create Constructor;
	 {
		this. model = model;
		 this.color = color;
		 this.price = price;
	 }
		 
	 
	public void PrintCarInformation()
	{
		System.out.println("model: "+this.model);
		System.out.println("color: "+this.color);
		System.out.println("price: "+this.price);
	}
			

	public static void main(String[] args) {
		Inheritance1 mycar = new Inheritance1("Farari","Red",444444);
		/*
		mycar.model = "Farari";
		mycar.color = "Red";
		mycar.price = 67467378;
		mycar.mileage = 12.5f;
		mycar.PrintCarInformation();
		mycar.printmileage();
		*/
	}
}
class Maruti extends Inheritance1
{
	
	
	float mileage;
	Maruti(float mileage)
	{
		this.mileage = mileage;
	}
	void printmileage()
	{
		System.out.println("mileage: "+ this.mileage);
	}
}
