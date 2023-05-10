package Encapsulation;
class Emp1
{
	private int EmpId;
	 private int Salary;
	 private String Name;
	 public void SetName(String nam)
	 {
		  Name = nam;
	 }
	 public String getName()
	 {
		 return Name;
	 }
	 public void SetEmpid(int EpId)
	 {
		 EmpId = EpId;
	 }
	 public void SetSalary(int nam)
	 {
		 Salary = nam;
	 }
	 public int getEmpId()
	 {
		 return EmpId;
	 }
	 public int getSalary()
	 {
		 return Salary;
	 }
}
public class Emp {

	public static void main(String[] args) {
		 Emp1 e = new  Emp1();
	     e.SetEmpid(50);
	    System.out.println(e.getEmpId());
	    e.SetSalary(8000);
	    System.out.println(e.getSalary());
	    e.SetName("Harbhajan isng");
	    System.out.println(e.getName());
	 

	}

}
/*
     Set Method-> To initialize the value
     Get Method-> to view the 
*/

