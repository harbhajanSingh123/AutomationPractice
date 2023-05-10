
public class Cons1 {
	 public Cons1(){
		System.out.println("This is a Zero-Paragraph");
	}
	 public Cons1(char c)
	 {
		 System.out.println("This is the Single Parameter Constructor");
	 }
	 public Cons1(int a,int b)
	 {
		 System.out.println("This is the int-int type Parameter");
	 }
	 public Cons1(int a,char b)
	 {
		 System.out.println("This is the int-char type parameter");
	 }
	 public Cons1(double a, int b)
	 {
		 System.out.println("This is the double-int type parameter");
	 }

	public static void main(String[] args) {
		Cons1 a = new 	Cons1();
		Cons1 b = new Cons1('a');
		Cons1 c = new Cons1(4,5);
		Cons1 d = new Cons1(7,'a');
		Cons1 e = new Cons1(10.6,10);

	}

}


/*
 Constructor-> Constructor is a block similar to method constructor same
 name as of class name 
 constructor does not have any return type not even void 
 The Only Modifier applicable for constructor that is public,private,protected
 default:
 it executes automatically when we create an object
 Customer is used to initiate non static member of the class
*/