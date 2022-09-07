package Slenium_grid;

public class Descending {
	
	public static void main(String[] args) {
		
		int a[]= {10,50,40,30,20};
		
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=i+1; j<=a.length-1;j++)
			{
				if(a[i]<a[j])
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
