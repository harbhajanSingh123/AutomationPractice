
public class ThisKeyWord1 {
	void Display()
	{
		System.out.println(" i am aashutosh singh");
	}
	void Display2(int a,int b)
	{
	   this.Display();
	}

	public static void main(String[] args) {
		 ThisKeyWord1 A = new  ThisKeyWord1();
		 A.Display2(4,7);
				 

	}

}
