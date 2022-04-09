package Unit_01;

public class p5_Task01_ClassAndObjectInJava {

	public static void main(String[] args) {
		
		ABC2 obj = new ABC2();
		obj.display2();
		ABC2.display();

	}

}

class ABC2 {
	int a = 10;
	static int b = 10;
	
	static void display() {
		
		int c = 10;
		
		c++;
		
		//System.out.println(a);
		System.out.println(c);
		
	}
	
	void display2() {
		
		System.out.println(a);
		//As c was a local variable so we can not access it outside the method
		//System.out.println(c);
	}
}