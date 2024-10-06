package com.patterns;

import java.util.Scanner;

public class LeftPascalTrianglePattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of rows");
		int rows = sc.nextInt();
		System.out.println("Left Pascal's Triangle");
		for (int i = rows; i >= 1; i--) {
			for (int j = 1; j <= rows; j++) {
				if ((j - i) >= 0)
					System.out.print(" *");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= rows; j++) {
				if (i == 1 && j == 1) {
					break;
				}
				if ((i - j) > 0)
					System.out.print("  ");
				else
					System.out.print(" *");
			}
			if (i == 1) {
				System.out.print("");
			} else {
				System.out.println();
			}

		}
		sc.close();
	}

}
