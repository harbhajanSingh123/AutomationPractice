package Array;

public class Example1 {

	public static void main(String[] args) {
		int a[];
		a  = new int[5];
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		System.out.println(a.length);
		for(int i = 0; i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		

	}

}
