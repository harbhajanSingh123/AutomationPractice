package Arrayexp;

/*
 * To print smallest Element of the array 
 */

public class Exp5 {

	public static void main(String[] args) {
		int array[] = {10,11,12,50,9,88,3,2};
		int min = array[0];
		for(int i = 0; i<array.length; i++)
		{
			if(array[i]<min)
			{
				min = array[i];
			}
		}
		System.out.println(min);

	}

}
