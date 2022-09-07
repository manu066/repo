package asgn;

public class Stringpalindrome {

	public static void main(String[] args) {
		String s1="MOM";
		String rev="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			rev=rev+s1.charAt(i);
		}
		if(s1.equals(rev))
		{
			System.out.println(rev);
			System.out.println("palindrome");
		}
		else
			
		{
			System.out.println("not palindrome");
		}
		
		}

}
