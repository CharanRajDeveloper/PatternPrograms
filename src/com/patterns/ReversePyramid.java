package com.patterns;

public class ReversePyramid {
	public static void main(String[] args) {
		int row = 6;
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= row; j++) {
				if ((i - j) > 0)
					System.out.print("  ");
				else
					System.out.print("*  ");
			}
			System.out.println();
		}
	}

}
