
public class ThisKeyword {
	int i;
	public void setValues(int i)
	{
		i=i;
	}
    public void show() {
	
		System.out.println(i);
	
    }
	public static void main(String[] args) {
		ThisKeyword r= new ThisKeyword();
		r.setValues(10);
		r.show();
		

	}

}
