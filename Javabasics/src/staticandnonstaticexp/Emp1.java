package staticandnonstaticexp;

public class Emp1 {
	static int rollnum;
	static String  Firstname;
	static String Lastname;
	static int age;
	static double salary;
	int A;
	double B;

	public static void main(String[] args) {
		System.out.println("Area Of Circle  programs");
		
		double pie = 3.14;
		int r = 78;
		double Area = pie*r*r;
		System.out.println("pie : "+pie);
		System.out.println("radius = "+r);
		System.out.println("Area = "+ pie*r*r);
		
		
		// LOCAL VARIBALE
		
		int Employeeage = 45;
		String Employeename = "Harbhajan singh";
		
		// NON STATIC VARIBALE
		
		Emp1 e = new Emp1();
	System.out.println("nonstaic global varibale : "+e.A);
	System.out.println("nonstaic global varibale :"+e.B);
	e.A=10;
	e.B = 10.75;
	System.out.println();
	System.out.println("****** UPDATED VALUE***********");
	System.out.println();
	System.out.println("nonstaic global varibale : "+e.A);
	System.out.println("nonstaic global varibale :"+e.B);

	// STATIC VARIBALE 
	
		System.out.println(Employeeage);
		System.out.println(Employeename);
		System.out.println(Emp1.rollnum);
		System.out.println(Firstname);
		System.out.println(Lastname);
		System.out.println(age);
		System.out.println(salary);
		rollnum = 1;
		Firstname = "Harbhajan ";
		Emp1.Lastname = "Singh";
		age = 22;
		salary = 78000.89;
		System.out.println("Roll Number: "+rollnum);
		System.out.println("Firstname : "+Firstname);
		System.out.println("Lastname : "+Lastname);
		System.out.println("Age : "+age);
		System.out.println("Salary : "+salary);

	}

}
