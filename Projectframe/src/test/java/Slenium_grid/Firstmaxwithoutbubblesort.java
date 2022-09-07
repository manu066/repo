package Slenium_grid;

public class Firstmaxwithoutbubblesort {

	public static void main(String[] args) {
	
		int[] a= {50,10,40,30,90};
		
		int max=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
			
		}
		System.out.println(max);
		
		
		

	}

}
