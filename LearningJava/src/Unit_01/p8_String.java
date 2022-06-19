package Unit_01;

/* Problem Statement:

P8_String: 

(Create separate logic in separate function)

F1 - Check the entered string is palindrome or not? 
  		String s = "75457"
  		Output: Yes it is a palindrome or No it is not a palindrome.

F2 - Make a reverse of a string using?
F3 - String Compare: Check if the strings are equal or not?

 * */

public class p8_String {

	public static void main(String[] args) {

		QuestionsOnString obj = new QuestionsOnString();

		String s1 = new String("75457");
		String s2 = new String("7545a");

		obj.palindromeOrNot(s1);
		obj.reverseOfAString(s2);
		obj.stringEqualOrNot(s1, s2);

	}

}

class QuestionsOnString {

	void palindromeOrNot(String s) {
		// Write Logic Here!
		int i=0,j=s.length()-1;
		int f=0;
		while(i<j)
		{
			if(s.charAt(i++)!=s.charAt(j--))
			{
				f=1;
				break;
			}
		}
		if(f==0)
			System.out.println(s+"is palindrome");
		else
			System.out.println("not palindrome");
		

	}

	void reverseOfAString(String s) {
		// Write Logic Here!
		

		String n="";
		int i=s.length()-1;
		while(i>=0)
		{
			n+=s.charAt(i);
			i--;
		}
		
		System.out.println(n);
		

	}
	
	void stringEqualOrNot(String s1,String s2) {
		// Write Logic Here!
		if(s1.length()!=s2.length()) {
			System.out.println("no");
			return;
		}
		else
		{
			int i=0;
			while(i<s1.length())
			{
				if(s1.charAt(i)!=s2.charAt(i))
				{
					System.out.println("no");
					return;
				}
				i++;
			}
			System.out.println("yes");
		}
		
	}
}