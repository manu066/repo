package asgn;

import java.util.Arrays;

public class Sumarray {
	private static int[] add(int[] a, int[] b) {
		int length =a.length < b.length ? a.length : b.length;
		int[] result = new int[length]; 
		for (int i = 0; i < length; i++)
		{ 
			result[i] = a[i] + b[i]; } 
		return result; 

	}


	public static void main(String[] args) {
		int a[]= {2,4,6,8};
		int b[]= {3,7,9};
		int result[]=add(a,b);
		System.out.println(Arrays.toString(result));
	}



	}


