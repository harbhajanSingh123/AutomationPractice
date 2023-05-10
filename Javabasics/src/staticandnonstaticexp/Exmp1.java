package staticandnonstaticexp;
/*
 Non StaticGlobal Variable-> Any Global variable is declared 
 * out side the method body but present in the class body without
 * static keyword known as non static global variable
 * 1. If we declared any global variable and not initialize
 * and try to use them then the java compiler assign default 
 * values based on their data type
 * 2. These variable will get separate memory location for storage
 * 
 */
public class Exmp1 {
	String name;
	int salary;

	public static void main(String[] args) {
		
		Exmp1 e = new Exmp1();
		System.out.println(e.name);
		System.out.println(e.salary);
		e.name = "harbhajan Singh";
		e.salary = 89000;
		System.out.println(e.name);
		System.out.println(e.salary);

	}

}
