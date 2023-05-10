package thiskeythisstatment;

/*
 * This Keyword-> this is a reference variable that refers 
 * to the current class object and also differentiate between 
 * local and 
 */

public class examp1 {
	examp1() {
		System.out.println(" i am method one");
		this();
		
	}
	examp1(double b) {
		System.out.println(" i am method two");
		
	
	}
	examp1(int a) {
		System.out.println(" i am method three");
	}

	public static void main(String[] args) {
		 examp1 e = new examp1();

	
		

	}

}
