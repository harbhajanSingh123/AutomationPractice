package encapsulationExample;

/*
 * Encapsulation-> in java encapsulation means Wrapping
 * code and data into a single unit is known as 
 * Encapsulation
 * There Are two Ways to achieve Encapsulation
 *1. BY Using SET method
 *2. BY Using GET Method
 *SET modifying the value of class VAribale with private 
 *keyword
 *Encapsulation class have a Private variable 
 *and get method is achieved the encapsulation
 *SET methods are return type is void 
 *get method are return type is same as that are class variable 
 *return value
 *
 *
 *
 * 
 */
 
class Worker
{
	private String workerName;
	private String address;
	Worker()
	{
		
		System.out.println("i am Worker ");
	}
	public void set1(String workerName)
	{
		
		this.workerName = workerName;
	}
	public void set( String address)
	{
		this.address = address;
	}
	public String getworkerName()
	{
		return workerName;
	}
	public String getaddress()
	{
		return address;
	}
}
public class Exam2 {

	public static void main(String[] args) {
		Worker w = new  Worker();
		w.set1("Harbhajan Singh");
		System.out.println("WorkerName is : "+ w.getworkerName());
		w.set("Jaunpur");
		System.out.println("workerAddress is :"+w.getaddress());


	}

}
