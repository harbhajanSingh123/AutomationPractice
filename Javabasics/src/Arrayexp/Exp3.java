package Arrayexp;

/*
 * QUE-> PRINT THE ELEMENT OF THE ARRAY PRESENT ON EVEN POSITION
 */

public class Exp3 {

	public static void main(String[] args) {
		int array[] = {10,11,12,13,14,15,16,17,18,19,20};
		for(int i =0; i<array.length; i++)
		{
			if(array[i]%2==0)
			{
				System.out.println(i+" "  + "Index of Even Postion of Array : "+ array[i]);
			}
			else
			{
				System.out.println(" ");
			}
		}

	}

}
