package Unit_01;

/* 
*****
  	Variables- variables in java is a data container thet saves the data value during the java program execution
 	
 	Types of variables:
			- In Java, there are three types of variables:

				. Local Variables
						- Declared inside the body of a method

				. Instance Variables
						- Instance variables are defined without the STATIC keyword.
	   					- They are defined Outside the method declaration. 
	   					- They are Object specific and are known as instance variables.

				. Static Variables
						- static variables are defined with the static keyword
	  					- Static variables are initialized only once during program execution.
		  				- These static variables should be initialized first before the initialization of instance variable
		  				- We can access static variables using class name
		  				- They are also known as class variables
		  				- They are shared among all the object of that class

*****

	Data Types in Java:
			-Data types in java are defined as specifiers that allocates different sizes and type of values that can be stored in the variables or an identifier
	
	Types of Data Types in Java:
			-Primitive examples=(int, float, double, boolean, long, char)
			-Non primitive examples=(string, array) 

	Data Type 	Default size
	boolean 	1 bit
	char 		2 byte
	byte 	 	1 byte
	short 	 	2 byte
	int 	 	4 byte
	long 	 	8 byte
	float 		4 byte
	double 		8 byte

*****
 	Java variable type conversion and type casting:
 			. Type conversion:
 					-Variable of smaller capacity is assigned to another variable of bigger capacity
 					-This process is automatic and non explicit
 					
 			.Type casting
 					-Variable of larger capacity is assigned to another variable of smaller capacity
 					-In this you have to explicitly specify the type cast operator
*****


	*/
public class p3_Task01_VariablesAndDataTypesInJava {
	
	static int q = 11;//static variable
	
	int p = 10;//instance variable
	

	public static void main(String[] args) {
		//local variables
        int myNum=5; //integer(whole no)
        float myFloatNum = 5.99f; // floating point no
        char myLetter = 'D';//character
        boolean myBool = true; // Boolean
        String myText = "Hello"; //String
        
         System.out.println("myNum="+myNum);
         System.out.println("myFloatNum="+myFloatNum);
         System.out.println("myLetter="+myLetter);
         System.out.println("myBool="+myBool);
         System.out.println("myText="+myText);
         
         
         double f;
         int i = 10;
         f = i; //int to float TypeConversion
         
         double g = 10;
         int j;
         j = (int) g;//TypeCasting
         
         System.out.println(f);
         System.out.println(i);
         System.out.println(g);
         System.out.println(j);
         
         
        System.out.println(ABC2.j);//static variable of class ABC
        
        ABC2 obj1 = new ABC2();
        System.out.println(obj1.i++);//instance variable of  class ABC
        System.out.println(obj1.i);
        
        ABC2 obj2 = new ABC2();
        System.out.println(obj2.i);
        
        
        System.out.println(ABC2.j++);
        System.out.println(ABC2.j);
        
        ABC2.typeconversionAndTypecasting();
        
        
	}
	
	int r = 10;
	
	void display() {
		
		int a = 5; //local variable
		System.out.println(" This Is Display Method!");
		System.out.println(a);
	
	}
}
class ABC2 {
	static int j = 10;// class variable/static variable
	int i = 10;// Instance variable
	
	static void display() {
		
		int a = 5; //local variable
		System.out.println("This is Display Method!");
		System.out.println(a);
	}
	
	static void typeconversionAndTypecasting()
	{
		
		/*
		 * Double f; //8 bytes = 64 bits/slots int i=10;//4 bytes=32 bits/slots 
		 * f=i; // Type conversion system.outprintln(f);
		 *
		 *double g = 10 ; // 64 int j; //32 j = (int)g;
		 */
		
		double f; //64 slots
		int i = 10; //32 slots
		f = i; //Type Conversion
		System.out.println(f);
		
		double g = 10; //64
		int j; //32
		j = (int)g;//Type Casting
		
		//32 bits = 64 bits
		
		System.out.println("i="+i);
		System.out.println("j="+j);
	}
}