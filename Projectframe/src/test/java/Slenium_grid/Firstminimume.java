package Slenium_grid;

public class Firstminimume {

	public static void main(String[] args) {

	int[] a= {10,90,50,5,40,60,70};
		
		for (int i = 0; i < a.length; i++) {
		  for (int j = 0; j < a.length; j++) {
			  if(a[i]<a[j])
			  {
				  int swap=a[i];
					a[i]=a[j];
					a[j]=swap;
			  }
			
		  }
		  
		  
			
		}
		
		System.out.println("first minium no "+a[0]);

	}

}
