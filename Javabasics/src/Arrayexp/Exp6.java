package Arrayexp;

/*
 * SORT ELEMENT IN ASSENDING ORDER
 */

import java.util.Arrays;

public class Exp6 {

	public static void main(String[] args) {
		 int[] array = { 1, 2, 3, 4, 5 };

	      // specify the number of positions to rotate the array
	      int positions = 2;

	      // left rotate the array by the specified number of positions
	      for (int i = 0; i < positions; i++) {
	         int j, first;
	         // save the first element of the array
	         first = array[0];
	         for (j = 0; j < array.length - 1; j++) {
	            // shift the array elements to the left
	            array[j] = array[j + 1];
	         }
	         // set the last element to the first element
	         array[j] = first;
	      }

	      // print the left rotated array
	      System.out.println("Left rotated array:");
	      for (int i = 0; i < array.length; i++) {
	         System.out.print(array[i] + " ");

		
		
		
	/*	
	int array[] = {10,11,78,67,89,9,5,7,9,76,98};
	Arrays.sort(array);
	for(int i = 0; i<array.length;i++)
	{
		System.out.println("Assemding order : "+array[i]);
	}
	*/

	}
	}
}
