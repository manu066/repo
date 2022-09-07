package Slenium_grid;

import org.testng.annotations.Test;

public class Sorting {
	
	@Test
	public void SortingElementInAscendingOrder()
	{
		
		int a[]= {20,10,40,50,30};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int swap=a[i];
					a[i]=a[j];
					a[j]=swap;
				}
			}
			System.out.print(a[i]+" ");
		}
		
		
	}

}
