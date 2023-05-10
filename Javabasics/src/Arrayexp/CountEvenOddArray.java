package Arrayexp;

public class CountEvenOddArray {

	public static void main(String[] args) {
		int a[] = {10,11,12,13,14,15,16};
		int sum = 0, odd = 0;
		for(int i = 0; i<a.length; i++)
		{
			if(a[i]%2==0)
			{
				sum = sum+a[i];		
			}
		    else
			{
				odd = odd+a[i];
			}
		}
		System.out.println("Sum of Even Number : "+sum);
		System.out.println("Sum of odd Number : "+odd);
	}

}
