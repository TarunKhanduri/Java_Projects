package Unit_01;

public class p4_Task02_WrapperClassInJava {
/*
 * The wrapper class in java provides the mechanism to convert primitive into object
 */
	public static void main(String[] args) {
		int a=10;

		Integer i=Integer.valueOf(a);//explicit conversion
		Integer j=a;//autoboxing:compiler will write Integer.valueOf(a) internally
		
		System.out.println(a+" "+i+" "+j);
		
		System.out.println(i.toString());
		//a.toString() can not be done as a is not object
		//autoboxing=converting primitive into objects
		
		byte b=10;
		Byte byteobj=b; 
		
		byte bytevalue = byteobj;
		System.out.println(bytevalue);
	}

}
