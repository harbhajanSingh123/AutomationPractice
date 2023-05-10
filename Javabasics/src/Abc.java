
public class Abc {
	int studentid;
	String Name;
	public Abc(int studentid,String Name)
	{
		this.studentid = studentid;
		this.Name = Name;
		
	}
	void display()
	{
		System.out.println(studentid+"::"+Name);
	}
	

	public static void main(String[] args) {
		Abc A = new Abc(121,"Harbhajn singh");
		A.display();
	
	

	}

}
