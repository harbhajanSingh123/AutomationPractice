
public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int num=4560;
		int result;
		while(num>0) {
		result=num%10;
		System.out.print(result);
		num=num/10;
		}
		*/
	
		int result=0;
		for(int num=4321;num>0;num=num/10)
		{
			result=num%10;
		}
		System.out.println(result);
	

	}

}
