
public class Override extends Xyz {
	 public void show()
	{
		 super.show();
		System.out.println("today");
		 
	}

	public static void main(String[] args) {
		
		Override O = new Override ();
		O.show();
		Xy X = new Xy();
		X.show();
		

	}

}
class Xyz
{
	 public void show()
	{
		System.out.println("tommarow");
	}
}
class Xy
{
	public void show()
	{
		System.out.println("Yesterday");
	}
}
