package day2;

abstract class Emp
{
	  abstract void  show();	
	    {
	    	System.out.println(" hduoehfhd");
	    }
	private int A= 10;
	private int B = 20;
    private void m1()
	{
	   System.out.println("Sum of setA + setB = "+(A+B));
	}
	public void setA(int A)
	{
		this.A = A;
	}
	public int getA()
	{
		return A;
	}
	public void setB(int B)
	{
		this.B = B;
	}
	public int getB()
	{
		return B;
	}
	  public void calculateSum() {
	        m1();
	    }
	  
}
 class Emp1 extends Emp
{

	
	
	void show() {
		System.out.println(" hdf");
	}

	
	
}

public class EncapExamp  {
	

	public static void main(String[] args) {
		/*
		Emp E = new Emp();
		E.setA(111);

        E.setB(12);
        System.out.println("value of setA = "+E.getA());
        System.out.println("value of setB = "+ E.getB());
       E.calculateSum();
       */
		Emp1 E = new Emp1();
		E.show();
		
		
				
				
	}

}
