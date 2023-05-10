package Arrayexp;

/*
 * QUE-> TO PRINT THE LARGEST ELEMENT OF AN ARRAY 
 */

public class Exp4 {

	public static void main(String[] args) {
	
		int array[] = {10,20,30,40,33,23,99,101,};
		int max = array[0];
		for(int i = 0; i<array.length; i++)
		{
			if(max<array[i])
			{
				max = array[i];
			}
		}
		System.out.println(max);

	}

}
