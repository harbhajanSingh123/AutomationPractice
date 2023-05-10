
public class Cons3 {
	int roll;
	double salary;
	void display()
	{
		System.out.println(roll+" "+salary);
	}

	public static void main(String[] args) {
		
		Cons3 c= new Cons3();
		c.roll=2;
		c.salary = 70000.777;
		c.display();

	}

}
