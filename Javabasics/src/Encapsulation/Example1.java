package Encapsulation;
 
class Car
{
	private int price=47744;
	private String carName = "MAruti";
	public int getprice() {
		return price;
	}
	public String getcarName()
	{
		return carName;
	}
	public void Setprice(int Price)
	{
		this.price = Price;
	}
	public void SetcarName(String carName)
	{
		this.carName = carName;
	}
}
public class Example1 {

	public static void main(String[] args) {
	Car C = new Car();
	System.out.println("Car Price:"+C.getprice());
	System.out.println("Car Price:"+C.getcarName());
	C.Setprice(7800);
	System.out.println("Updated Price of Car"+C.getprice());
	C.SetcarName("Innova");
	System.out.println("update Car Name"+C.getcarName());

	}

}
