package com.patterns;

public class DownwardRightTriangle {
	public static void main(String[] args) {
		int rows=6;
		for (int i = rows; i >= 1; i--) {
			for (int j = 1; j <= rows; j++) {
				if ((j - i) > 0)
					System.out.print(" ");
				else
					System.out.print("* ");
			}
			System.out.println();
		}
	}

}
