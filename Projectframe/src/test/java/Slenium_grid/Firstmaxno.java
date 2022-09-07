package Slenium_grid;

public class Firstmaxno {

	public static void main(String[] args) {
		int a[]= {80,10,60,70,50,100};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int swap=a[i];
					a[i]=a[j];
					a[j]=swap;
				}
			}
		}
		System.out.println("first maximume no "+a[0]);
		

	}

}
