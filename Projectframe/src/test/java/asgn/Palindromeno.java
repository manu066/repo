package asgn;

public class Palindromeno {

	public static void main(String[] args) {
		int no=121;
		int copy=no;
		int sum=0;
		
		while(no!=0)
		{
			int rem=no%10;
			sum=sum*10+rem;
			no=no/10;
		}
		
		if(sum==copy)
		{
			System.out.println("palindrome");
		}
	}

}
