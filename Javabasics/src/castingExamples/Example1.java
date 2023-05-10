package castingExamples;

/*
 * Type Casting-> converting one type to another type
 *                called type casting
 * Why do You Use Type Casting->The use of type Casting
 * is Used to Support Heterogeneous statement are called
 * type casting
 * heterogeneous->(LHS = RHS)
 * EXP-- int = 25.8;
 * there are two types of type casting
 * 1. Primitive Type Casting
 * 2. Non Primitive/Derived type casting
 * 
 * 
 * Primitive type Casting-> Converting one data type into
 * another data type are called Primitive type Casting
 * ## There are two types of Primitive Casting
 * i). Widening
 * ii). Narrowing
 * 
 * Widening-> Converting Lower data type into higher data
 * type are called as widening
 * 
 * FOR EXP-> int a = 10;
 *           double d = a;// WIDENING IMPLICIT(TO CREATE JAVA COMPILER)
 *           double d = double(a)Explicit Widening type casting
 *                               to create programmer
 *                               
 * 
 * Narrowing-> Converting higher data into lower data 
 * are called as narrowing
 * Narrowing type casting is always explicit type casting
 * in narrowing type casting we loss value or size
 * FOR EXP-> double a = 10;
 *           int d = int(a);//Explicit Widening type casting
 *                               to create programmer
 *          j
 * 
 */

public class Example1 {

	public static void main(String[] args) {
		 
		int a = 10;
		long b = (long)a;
		double d = a; // implicit widening
		double c = (double)a; // Explicit widening
		System.out.println(a);
		System.out.println(d);
		System.out.println(c);
		System.out.println(b);
		
		double C = 12.888;
		int x = (int)C;
		long z = (long)C;
		float y = (float)C;
		System.out.println("*******************");
		System.out.println("double value: "+C);
		System.out.println("int value: "+x);
		System.out.println("long value : "+z);
		System.out.println("float value : "+y);
		

	}

}
