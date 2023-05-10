
public class ReverseNumberUsingWhileLoop {

	public static void main(String[] args) {
		int num = 1234567;
		int res;
		 while(num>0)
		 {
			 res=num%10;
			 System.out.print(res);
			 num = num/10;
				
		 }
		

	}

}
