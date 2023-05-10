
public class Employee {
	int employeeId;
    String employeeName ;
    String employeeAddress;
    double empSalary;
	public Employee(int employeeId , String employeeName, String employeeAddress,double empSalary )
    {
    	this.employeeId = employeeId;
    	this.employeeName = employeeName;
    	this.employeeAddress = employeeAddress;
    	this.empSalary = empSalary;
    }
    void show()
    {
    	System.out.println("EmployeeId : "+employeeId);
    	System.out.println("EmployeeName : "+employeeName);
    	System.out.println("EmployeeAddress : "+employeeAddress);
    	System.out.println("EmployeeSalary : "+empSalary);
    	System.out.println();
    }
	public static void main(String[] args) {
	Employee E = new Employee(1,"Harbhajan Singh","Jaunpur",4100.75);
	E.show();
	Employee A = new Employee(2,"Ankit Singh","Jaunpur",42000.65);
	A.show();
	Employee B = new Employee(3,"Balmukund","Sultanpur",35000.65);
	B.show();
	}
}
