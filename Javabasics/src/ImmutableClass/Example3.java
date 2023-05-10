package ImmutableClass;

final class Employee
{ 
	final String name;
	final int salary;
	Employee(String name,int salary)
	{
		this.name = name;
		this.salary = salary;
	}
	public  String getname()
	{
		return name;
	}
	public int getsalary()
	{
		return salary;
	}
	
}
public class Example3 {

	public static void main(String[] args) {
		Employee e = new Employee("harbhajan singh",78000);
        System.out.println(e.name);
        System.out.println(e.salary);
        System.out.println(e.getClass());
        System.out.println(e.hashCode());
        System.out.println(e.toString());
        System.out.println(e.);
	}

}
