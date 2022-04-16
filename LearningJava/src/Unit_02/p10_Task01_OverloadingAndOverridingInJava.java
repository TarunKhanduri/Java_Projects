package Unit_02;
/*
Method Overloading:

	-	Method Overloading is a Compile time polymorphism. 
	-	In method overloading, more than one method shares the same method name with a different signature in the class. 
	-	In method overloading, the return type can or can not be the same, but we have to change the parameter because, in java, we can not achieve the method overloading by changing only the return type of the method. 

Method Overriding: 

	-	Method Overriding is a Run time polymorphism.
	-	In method overriding, the derived class provides the specific implementation of the method that is already provided by the base class or parent class. 
	-	In method overriding, the return type must be the same or co-variant (return type may vary in the same direction as the derived class). 
*/

public class p10_Task01_OverloadingAndOverridingInJava{
	public static void main(String[] args) {
		
		OverloadingAndOverridingInJava obj = new OverloadingAndOverridingInJava();
		
		System.out.println("Add() with 2 parameters : ");
		System.out.println(obj.add(4, 6));
		
		System.out.println("Add() with 3 parameters : ");
		System.out.println(obj.add(4, 6, 10));
		
		InheritFirstOne obj2 = new InheritFirstOne();
		System.out.println(obj2.add(3, 2));
		
	}
}


class OverloadingAndOverridingInJava {
	
	// Method Overloading - ??
	// Method Overloading can be done within the same class.
	
	int add(int a , int b) {
		
		System.out.println("Inside OverloadingAndOverridingInJava");
		return a+b;
		
	}
	
	int add(int a, int b, int c) {
		
		System.out.println("Inside OverloadingAndOverridingInJava");
		return a+b+c;
		
	}
	
}

// Overriding In Java - ??
class InheritFirstOne extends OverloadingAndOverridingInJava{
	int add(int a, int b) {
		
		System.out.println("Inside InheritFirstOne");
		return a+b;
		
	}
	
	int add(int a, int b, int c) {
		
		System.out.println("Inside InheritFirstOne");
		return a+b+c;
		
	}
}