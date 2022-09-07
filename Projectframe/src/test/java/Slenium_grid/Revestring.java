package Slenium_grid;

import org.testng.annotations.Test;

public class Revestring {
	
	@Test
    public void reverse()
    {
		String s="india";
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		
		System.out.println(rev);
		
    }
	

}
