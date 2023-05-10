package encapsulationExample;
class Employee
{   private int empId;
	private String employeeName;
	public void set(int empId)
	{
		this.empId = empId;
	}
	public void set(String employeeName)
	{
		this.employeeName = employeeName;
	}
	public int getempId()
	{
		return empId;
	}
	public String getemployeeName()
	{
		return employeeName;
	}
}
public class Company {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.set(10);
		System.out.println("Employee Id is: "+e.getempId());
        e.set("Harbhajan Singh");
        System.out.println("Employee Name is : "+e.getemployeeName());
	}

}
