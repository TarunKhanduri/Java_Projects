package Unit_02;

// Inside this package, we can create many classes.

import static java.lang.System.*;
import static java.lang.Math.*;

import Unit_01.p3_Task01_VariablesAndDataTypesInJava;

public class p11_Task02_ImportingAndPackagesInJava {
	public static void main(String[] args) {
		
		out.println("Welcome to package");
		
		
		out.println(sqrt(4));               // Use of "out"
		System.out.println(pow(2, 2));
		System.out.println(abs(6.3));
		
		p3_Task01_VariablesAndDataTypesInJava obj = new p3_Task01_VariablesAndDataTypesInJava();

	}
}