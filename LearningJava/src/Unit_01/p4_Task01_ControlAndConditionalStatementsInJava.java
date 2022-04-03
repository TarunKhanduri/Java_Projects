package Unit_01;
/*
Control Statements and Conditional Statements:
		
		- java provides 3 types of control flow statements:
				
				- Decision making statements:
						- if statement
						- switch statement
				- Loop statements:
						- do while loop
						- while loop
						- for loop
						- for-each loop
				- Jump statements:
						- break statement
						- continue statement
*/
public class p4_Task01_ControlAndConditionalStatementsInJava {

	public static void main(String[] args) {
		Statements obj=new Statements();
		obj.DecisionMakingStatements();
//		obj.LoopStatements();
//		obj.JumpStatements();
		
	}
}

class Statements{
	void DecisionMakingStatements(){
		
		int x=10;
		int y=12;
		if(x+y<10)
			System.out.println("x+y is less than 10");
		else
			System.out.println("x+y is greater than 10");
		
		char num=48;
		System.out.println(num);
	}
}
