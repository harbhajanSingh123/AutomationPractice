
public class StaticMethodExample1 {

	public static void main(String[] args) {
		
		StaticMethodExample1 .methodOne("Abhishek  Singh","Rampur Jaunpur",2022);
		methodOne();
		calling(25);
		int i=28;
		calling(i);

	}
     public static void methodOne(String name,String address,int year) {
    	  System.out.println("my name is : "+name);
          System.out.println("i am from  : "+address);
          System.out.println("i am completed B-tech this year : "+year);
     }
     public static void methodOne()
     {
    	 System.out.println("i am harbhajan singh ");
    	 System.out.println("i am from jaunpur uttar pradesh");
    	 System.out.println("i am your automation trainer");
    	 
     }
     public static void calling(int num)
     {
    	 System.out.println("my name is xyz");
    	 System.out.println("my phone number is: "+num);
     }
    
       

}
