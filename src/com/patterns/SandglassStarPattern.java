
package com.patterns;

import java.util.Scanner;

public class SandglassStarPattern {
	public static void main(String[] args) {
		System.out.println("(Downward Left Triangle)+(Left Triangle)");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of rows");
		int rows = sc.nextInt();
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= rows; j++) {
				if ((i - j) > 0) {
					System.out.print("  ");
				} else {
					System.out.print("  * ");
				}
			}
			System.out.println("");

		}

		for (int i = rows; i >= 1; i--) {
			for (int j = 1; j <= rows; j++) {
				if (j >= i)
					System.out.print("  * ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		sc.close();
	}

}
