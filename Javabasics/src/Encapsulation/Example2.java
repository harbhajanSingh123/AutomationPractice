package Encapsulation;

public class Example2 {

	public static void main(String[] args) {
//		int a[];
//		a=new int[5];
		int a[]= new int[5];
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
	
		a[0]= 1;
		a[1] = 0;
		a[2]=2;
		a[3]=3;
		a[4]=4;
	
		System.out.print(a[0]+", ");
		System.out.print(a[1]+", ");
		System.out.print(a[2]+", ");
		System.out.print(a[3]+", ");
		System.out.print(a[4]+" ");
		System.out.println("UPDATING THE VALUE OF A ARRAY ");
		

		a[0]= 10;
		a[1] =20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		System.out.println("UPDATING THE ARRAY OF A[0] = "+a[0]);
		System.out.println("UPDATING THE ARRAY OF A[1] = "+a[1]);
		System.out.println("UPDATING THE ARRAY OF A[2] = "+a[2]);
		System.out.println("UPDATING THE ARRAY OF A[3] = "+a[3]);
		System.out.println("UPDATING THE ARRAY OF A[4] = "+a[4]);
		System.out.println();
		System.out.println("FIND THE LENGTH OF THE ARRAY");
	    System.out.println("The Length Of The Of The Array is = "+a.length);
	    
	    int age[]= {10,100,40,45};
	    for (int i = 0; i < age.length; i++) {
			System.out.println(age[i]);
		if (age[i] == 40) {
				System.out.println(age[i]);
				break;
			} else {
				System.out.println("age is not 40");
			}
	    	
	    }
	    

	}

}
