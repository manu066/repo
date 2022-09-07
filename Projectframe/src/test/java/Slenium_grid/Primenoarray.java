package Slenium_grid;

public class Primenoarray {

	public static void main(String[] args) {
		int a[]= {3,5,6,7,9,12};
		for (int j = 0; j < a.length; j++) {
			int n=a[j];
			int i=2;
			
			while(true)
			{
				if(n%i==0)
				{
					break;
				}
				else
				{
					i++;
				}
			}
			
			if(i==n)
			{
				System.out.print(a[j]+ " ");
			}
			
		}
	}

}
