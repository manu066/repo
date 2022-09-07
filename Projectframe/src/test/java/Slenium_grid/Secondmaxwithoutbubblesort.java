package Slenium_grid;

public class Secondmaxwithoutbubblesort {

	public static void main(String[] args) {
		int[] a= {110,50,10,40,30,90,100,15};
		
		int max=a[0];
		int sec=0;
		
		for(int i=1;i<a.length;i++)
		{
			if(max<a[i])
			{
				sec=max;
				max=a[i];
			}
			else if(max<a[i])
			{
				 
			}
			
		}
		System.out.println(max);
		System.out.println(sec);
		

	}

}
