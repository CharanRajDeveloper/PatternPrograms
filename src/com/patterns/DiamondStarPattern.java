package com.patterns;

public class DiamondStarPattern {
	public static void main(String[] args) {
		int row=6;
		for(int i=row;i>=1;i--) {
			for(int j=1;j<=row;j++) {
				if(j>=i)
					System.out.print("* ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		//System.out.println("************************");
		for(int i=1;i<=row-1;i++) {
			for(int j=1;j<=row-1;j++) {
				if((i-j)>0) {
					System.out.print(" ");
				}else {
					System.out.print(" *");
				}
			}
			System.out.println();
		}
		
	}
}
