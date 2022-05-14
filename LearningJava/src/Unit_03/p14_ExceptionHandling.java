package Unit_03;
import java.util.InputMismatchException;
import java.util.Scanner;
public class p14_ExceptionHandling {

	public static void main(String[] args) {
		ABC obj=new ABC();
		int age=12;
		
		obj.arithmatic_exception();
		System.out.println();
		
		obj.input_mismatch_exception();
		System.out.println();
		
		obj.stack_overflow_error();
		System.out.println();
		
		obj.manually_throw(age);
		System.out.println();
		
		obj.indexOutOfBoundException();
		System.out.println();
		
		obj.nullPointerException();
		System.out.println();
	}

}

class ABC{
	
	void arithmatic_exception()
	{
/*	
		int a=0;
		int b=100/a;
		System.out.println(b);
*/
		
		//		exception handling
		try {
			
			int a=0;
			int b=100/a;//exception
			System.out.println(b);
		}
		catch(ArithmeticException e )//child class of exception class
		{
			System.out.println(e.getMessage());
		}
		
		catch(Exception e )
		{
			System.out.println(e.getMessage());
		}

		finally {
			System.out.println("try catch is finished");
		}
/*		we can not write child class after super class	
		
		catch(Exception e )
		{
			System.out.println(e.getMessage());
		}
		catch(ArithmeticException e )//child class of exception class
		{
			System.out.println(e.getMessage());
		}
*/
//		rest code
		System.out.println("done");
	}
	
	void input_mismatch_exception()
	{
		//		input mismatch exception
		Scanner sc=new Scanner(System.in);
		try {
			
			int c=sc.nextInt();
			System.out.println(c);
		}
		catch(InputMismatchException e){
			System.out.println("input mismatch exception");
		}
		finally {
			System.out.println("try catch is finished");
		}
		
		
		//		rest code
		System.out.println("done");
		sc.close();

	}
	
	void stack_overflow_error()
	{
		int a=0;
		try {
			while(a>0)
			{
				a++;
				stack_overflow_error();
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("try catch is finished");
		}
//		rest code
		System.out.println("done");
	}
	
	void indexOutOfBoundException()
	{
		int arr[]= {1,2,3,4,5};
		try {
			System.out.println(arr[5]);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
//		rest code
		System.out.println("done");
	}
	
	void nullPointerException()
	{
		String s=null;
		try {
		System.out.println(s.length());
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
//		rest code
		System.out.println("done");
	}
	
	void manually_throw(int age)
	{
		//throw keyword
		try
		{
			if(age<18)
			{
				throw new ArithmeticException("access denied");
			}
			else
			{
				System.out.println("access granted");
			}
		}	
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
//	void input_mismatch_exception2() throws Exception
//	{
//		//throws keyword= we can use either throws or try catch
//		Scanner sc=new Scanner(System.in);
//		int c=sc.nextInt();
//		System.out.println(c);
//		
//		//		rest code
//		System.out.println("done");
//		sc.close();

//	}
}
