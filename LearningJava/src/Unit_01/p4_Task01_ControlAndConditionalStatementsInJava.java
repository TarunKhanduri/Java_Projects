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
		
		int num=2;
//		Q=can we use char instead of int as num?
//		ans= yes we can use char instead of int.It will consider the integer ASCII value
		
		switch(num) {
		case 0:System.out.println("num=0");
				break;
		case 1:System.out.println("num=1");
				break;
		case 2:System.out.println("num=2");
				break;
		default:System.out.println("num="+num);
		}
	}
	
	void LoopStatements() {
		
		int sum=0;
		for(int j=1;j<=10;j++)
			sum+=j;
		System.out.println("sum of 1st 10 natural number= "+sum);
		
	}
}
