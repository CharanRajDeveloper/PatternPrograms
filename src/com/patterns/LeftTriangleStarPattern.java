package com.patterns;

public class LeftTriangleStarPattern {
	public static void main(String[] args) {
		System.out.println("First logic");
		for (int i = 6; i >= 1; i--) {
			for (int j = 1; j <= 6; j++) {
				if (j >= i)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

		System.out.println("Second Logic");
		for (int i = 6; i >= 1; i--) {
			for (int j = 1; j <= 6; j++) {
				if ((j - i) >= 0)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
