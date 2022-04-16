package Unit_02;

// Inside this package, we can create many classes.
/*
-	a java package is a group of similar type of classes, interfaces and sub-packages
- 	package in java can be categorized in two forms
		-	built in package(lang, awt, javax, swing,net, io, util, sql)
		-	user defined package
		
-	package also helps to avoid class name collision
-	package also helps us to maintain access protection in java
-	packages are named in reverse order of domain names
-	unit01.javaprojects.com -> "com.javaproject.unit01"

import java.util.vector; //import the vector class from util package
import java.util.*; //import all the classes from util package

static import:
	-	static import is a feature introduced in java programming language (version 5 and above)
	-	that allows members (fields and methods) defined in a class as public static to be used in java code without specifying the class in which the field is defined
*/

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