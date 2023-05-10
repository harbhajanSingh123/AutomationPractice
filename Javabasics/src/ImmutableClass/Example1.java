package ImmutableClass;


/*
 * Immutable class-> it's value can't be changed if we change their value
 *                   then created new object 
 *                  1: Class name and its data are final 
 *                  2: Constructor should Parameterized to initialize final data 
 *                     variable
 *                  3: use only getter method to use final value ;
 */
final class ImmutableClass
{
	final String name ;
	final int salary;
	 ImmutableClass(String name,int salary)
	 {
		 this.name = name;
		 this.salary = salary;
	 }
	 public String getname()
	 {
		 return name;
	 }
	 public int getsalary()
	 {
		 return salary;
	 }
}
public class Example1 {

	public static void main(String[] args) {
		ImmutableClass p = new ImmutableClass("Harbhajan singh",8000000);
		System.out.println(p.getname());
		System.out.println(p.getsalary());
		System.out.println(p.getClass());
		ImmutableClass z= new ImmutableClass("Ankit singh ",873456857);
		System.out.println(p.getname());
		System.out.println(p.salary);
	}

}
