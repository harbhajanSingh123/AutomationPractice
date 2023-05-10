package ObjectClass;
 class A{
	 void display()
	 {
		 System.out.println("i am object of class A");
	 }
 }
public class Example3 {
	static int last_roll = 100;
	int first_roll;
	// CONSTRUCTOR*********************************
	Example3()
	{
		first_roll = last_roll;
		last_roll++;
	}
	//OVERRIDING TOSTRING METHOD************************
	public String toString()
	{
		return " i am harbhajan singh";
	}
	// OVERRIDING TO HASHCODE METHOD*********************************
	public int tohashcode()
	{
		return last_roll;
	}

	public static void main(String[] args) {
		A a = new A();
		System.out.println(a);
		System.out.println(a.toString());
		System.out.println("comparing to a class and tostring method : "+a.equals(a.toString()));
        System.out.println(a.hashCode());
        System.out.println(a.equals(a.hashCode()));
           
        Example3 e = new Example3();
        System.out.println(e);
        System.out.println(e.toString());
        System.out.println("Comapare to : "+e.equals(a) );
        
	}

}
