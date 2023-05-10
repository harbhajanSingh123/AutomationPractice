package ImmutableClass;
 
final class Testing
{
	final String name;
	final int rollno;
	final int salary;
	Testing(String name,int rollno,int salary)
	{
		this.name = name;
		this.rollno = rollno;
		this.salary = salary;
	}
	public String getname()
	{
		return name;
	}
	public int getrollno()
	{
		return rollno;
	}
	public int getsalary()
	{
		return salary;
	}
	public void display()
	{
		System.out.println(name);
		System.out.println(rollno);
		System.out.println(salary);
	}
}

public class Example2 {

	public static void main(String[] args) {
		 Testing t = new  Testing("Harbhajan Singh",2,75000);
		
		 System.out.println("Name : "+t.getname());
		 System.out.println("roll no : "+t.getrollno());
		 System.out.println("Salary : "+t.getsalary());
		

	}

}
