
public class LocalVariable1 {
	int a;
    double b;
    static int c;
    static double d;

	public static void main(String[] args) {
		int age = 20;
		double salary =10;
		System.out.println(age);
		System.out.println(salary);
		 LocalVariable1 L = new  LocalVariable1();
		 System.out.println(L.a);
		 System.out.println(L.b);
		 System.out.println( "c= "+LocalVariable1.c);
		 System.out.println( "d= "+LocalVariable1.d);
		 System.out.println(d);
		 System.out.println(c);

	}

}
/*
Local Variable-> A variable is declared in the method body are called as Local variable
2. it is accessible within the method body 
3. it is initialize before then use them otherwise will we get compile time error
4. it was not get separate memory location

Global Variable-> A variable is declared outside the method body but present in the 
                  class body are called as Global Variable
       1. A variable is accessible from any where
       2. If we declared any global variable without initialization and try to use 
          them then the java compiler assign to default value based on their data
          type
       3. A Global variable wants separate memory location for storage
     There are two types of Global Variable
                  1. Static Global Variable
                  2. Non Static Global Variable
1. Static Global Variable-> Any Global Variable declared with the Static Keyword are
                            Called as Static Global Variable
2. Non Static Global Variable-> Any Global Variable declare with without static 
                                Keyword are known as Non Static Global Variable
                                
                              DATATYPE
                 
There are two types of data types
1. Primitive Data Type
2. Non Primitive Data Type
1. Primitive Data Type-> There Are Eight Types Of Data Types
                        1.BYTE   - 8
                        2. SHORT - 16 
                        3. INT
                        4. LONG
                        5. FLOAT
                        6. DOUBLE
                        7. CHAR
                        8. BOOLEAN
2. Non Primitive Data Type-> class


VARIBALE-> A Variable is  the name of memory location in which programmer can store 
           the value based on their data type
    Syntax TO Declare->  Data Type variable name;
    Syntax To Initialize-> Data Type variable name = value; 
    
LITERALS-> Literals are date to representing fixed value they can be write directly
           in the code 
           There are Five Types are Literals are as follows
           1. BOOLEAN LITERALS
           2.FLOATING POINT LITERALS
           3.CHAR LITERALS
           4. INTEGER LITERALS
           5. STRING LITRERALS
IDENTIFIERS-> Identifiers are the name given by programmer while writing a program
              this name can be variable name , method name, class name 
          
           
          

*/