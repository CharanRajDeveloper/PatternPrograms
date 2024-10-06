package com.patterns;

public class RightPascalTriangle {
	public static void main(String[] args) {
		int row = 8;
		System.out.println("Right Pascal's Triangle");
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = row - 1; i >= 1; i--) {
			for (int j = 1; j <= row - 1; j++) {
				if ((j - i) > 0)
					System.out.print(" ");
				else
					System.out.print("* ");
			}
			System.out.println();
		}

	}

}
