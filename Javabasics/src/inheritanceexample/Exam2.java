package inheritanceexample;
class A
{
	int empid;
	String empname;
	String empaddress;
	public A(int empid, String empname,String empaddress)
	{
		this.empid = empid;
		this.empname = empname;
		this.empaddress = empaddress;
	}
	void display()
	{
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(empaddress);
	}
	
}
class B extends A
{
	public B(int empid, String empname, String empaddress) {
		super(empid, empname, empaddress);
		
	}

	void main()
	{
		System.out.println(" i am onjewct of class  B");
	}
}

public class Exam2 {

	public static void main(String[] args) {
		A a = new A(1,"Aman","AJunpur");
		a.display();
	
		

	}

}
