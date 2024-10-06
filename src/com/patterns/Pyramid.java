package com.patterns;

public class Pyramid {
	public static void main(String[] args) {

		  for(int i=6;i>=1;i--) {
			  for(int j=1;j<=6;j++) {
				  if(j>=i)
					  System.out.print("* ");
				  else
					  System.out.print(" ");
			  }
			  System.out.println();
		  }
		
		
	}

}
