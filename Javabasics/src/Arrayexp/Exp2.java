package Arrayexp;

/*
 * QUE-> PRINT THE SUM OF ALL THE ITEMS OF THE ARRAY 
 */



public class Exp2 {

	public static void main(String[] args) {
		 int array[] = {10,20,30,40,50,60};
		 int sum = 0;
		 for(int i = 0; i<array.length; i++)
		 {
			  sum = sum + array[i];
		 }
		 System.out.println(sum);

	}

}
