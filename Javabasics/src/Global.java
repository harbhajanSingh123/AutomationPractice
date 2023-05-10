
public class Global {
// define static global variable 
	static int a;
	static int b;
	{
		System.out.println(" i am akash ");
	}
	public static void display()
	{
		System.out.println("number a="+ a);
		System.out.println("number b="+ b);
		System.out.println("number a+b="+ (a+b));	
	}
	// DEFINE NON-STATIC GLOBAL VARIABLE
	int rollno;
	String name;
	public void display1()
	{
		System.out.println("rollno. = " + rollno);
		System.out.println("Name = "+ name);
	}
	static
	{
		System.out.println(" i am harbhajan singh from jaunpur uttar pradesh ");
	}
	{
		System.out.println("i am harkesh");
	}
	public static void main(String[] args) {
		//  DEFINE LOCAL VARIABLE: 
		
		int a = 40;
		int b  = 50;
		int c = a+b;
		System.out.println("*** LOCAL VARIABLE ***");
		System.out.println("number a ="+a);
	    System.out.println("number b ="+b); 
		System.out.println("Adding Two Number ="+c);
		System.out.println();
		System.out.println("**********************************");
		System.out.println(" *** STATIC GLOBAL VARIABLE ***");
		System.out.println();
		Global.a=10;
		Global.b=20;
		Global.display();
		System.out.println();
		System.out.println("*** NON STATIC GLOBAL VARIABLE ***");
		System.out.println();
	    Global g = new  Global();
	    g.rollno = 1;
	    g.name = "Harbhajan Singh";
	    g.display1();
	    System.out.println();
	    System.out.println("*** USING THIS KEYWORD ***" );
	    System.out.println();
	    EmployeeOne E = new EmployeeOne(1,"Harbhajan Singh","Rampur Jaunpur","CS(IT)");
	    E.display2();
	    System.out.println();
	    EmployeeOne s = new EmployeeOne(2,"Ankit  Singh","Rampur Jaunpur","CIVIL");
	    E.display2();    
	}
	static {
		System.out.println(" i am abhishek singh ");
	}
}
class EmployeeOne
{
	
	// USING THIS KEYWORD  
	int  EmployeeId;
	String EmployeeName;
	String  EmployeeAddress;
	String  EmployeeBranch;
	public EmployeeOne(int  EmployeeId,String EmployeeName, String EmployeeAddress,String EmployeeBranch  )
	{
		this.EmployeeId = EmployeeId;
		this.EmployeeName = EmployeeName;
		this.EmployeeAddress = EmployeeAddress;
	    this.EmployeeBranch =  EmployeeBranch;
	}
	public void display2()
	{
		System.out.println("EmployeeId : "+EmployeeId);
		System.out.println("EmployeeName : "+EmployeeName);
		System.out.println("EmployeeAddress : "+EmployeeAddress);
		System.out.println("EmployeeBranch : "+EmployeeBranch);
	}
	static 
	{
		System.out.println(" i am ankit singh form jaunpur uttar pradesh ");
	}
		
}
