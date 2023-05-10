package Arrayexp;
/*
Que1- Java Program to copy all the Elements of one array into 
another array
*/

public class Exp1 {

	public static void main(String[] args) {
		 int a[] = {10,20,30,40,50};
		 int b[]  = a.clone();
		 
		 for(int i = 0; i<a.length; i++)
		 {
			 System.out.print(a[i]+" ");
		 }
	}

}
