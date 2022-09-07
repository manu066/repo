package Slenium_grid;

public class Sumofminiumthreeno {

	public static void main(String[] args) {
int[] a= {10,90,50,5,40,60,70};
		
		for (int i = 0; i < a.length; i++) {
		  for (int j = 0; j < a.length; j++) {
			  if(a[i]< a[j])
			  {
				  int swap=a[i];
					a[i]=a[j];
					a[j]=swap;
			  }
			
		  }
		  
		  
			
		}
		int sum=0;
		for(int i=0;i<3;i++)
		{
			
		   sum=sum+a[i];
		   System.out.print(a[i]+" ");
		}
		System.out.println("sum of three minium no "+ sum);


	}

}
