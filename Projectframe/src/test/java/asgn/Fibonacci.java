package asgn;

public class Fibonacci {

	public static void main(String[] args) {
	int fib1=0;
	int fib2=1;
	int fib=0;
	for(int i=0;i<=10;i++)
	{
		fib=fib1+fib2;
		fib1=fib2;
		fib2=fib;
	}
	System.out.println(fib);

	}

}
