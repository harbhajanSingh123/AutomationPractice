package constructorexp;

/*
 * Constructor-> constructor is a block having same name that
 * of class name 
 * 2. constructor does not have any return type not even void 
 * 3. mainly use of constructor is to initialize non-static member
 * 4. The only modifier applicable for i:e public private
 *    protected and default 
 * 5. it executes automatically when we create an object
 *There Are Two Types Of Constructor
 *1. Default Constructor
 *2. Parameterized Constructor
 */

public class exmp1 {
	int empId;
	String empName;
	String empAddress;
	exmp1(int empId,String empName,String empAddress)
	{
		this.empId = empId;
		this.empName = empName;
		this.empAddress = empAddress;
	}
	void main()
	{
		System.out.println("EmployeeID : "+empId);
		System.out.println("EmpName : "+empName);
		System.out.println("EmpAddress : "+empAddress);
		
	}
	

	

	public static void main(String[] args) {
	exmp1 E = new exmp1(1,"Harbhajan Singh","rampur");
	E.main();
	System.out.println();
	exmp1 e = new exmp1(2,"Ankit Singh","Jaunpur");
	e.main();
	System.out.println();
	exmp1 e1 = new exmp1(3,"Abhishek Singh"," Rampur Jaunpur");
	e1.main();
	System.out.println();
	exmp1 e2 = new exmp1(3,"Amit Singh"," Rampur Jaunpur");
	e2.main();
	System.out.println();
	exmp1 e3 = new exmp1(3,"Akash Singh"," Rampur Jaunpur");
	e3.main();
	

	}

}
