
public class AnyMap {

	public static void main(String[] args) {
/*
		int a=10;
		int b=a;
		System.out.println("a:"+a);
		System.out.println("b:"+a);
		int k=++a;
		System.out.println("k:"+k);
		System.out.println("a:"+a);
		
		int j=k++;
		System.out.println("j:"+j);
		System.out.println("k:"+k);
	
		int a = 0,b;
		b = a++ + ++a + ++a +a;
		System.out.println("a="+a);
		System.out.println("b="+b);
	
		 a = -5;
		b = a-- + --a + --a + a;
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		a = 21;
		b = --a + --a + --a + a + ++a + a++;
		System.out.println(a);
		System.out.println(b);
		*/
		
		int a = -2;
		int b = a-- + a + ++a + a++ + ++a + a++ + a;
		System.out.println(a);
		System.out.println(b);
	}

}
