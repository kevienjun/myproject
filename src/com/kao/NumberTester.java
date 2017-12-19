package com.kao;

public class NumberTester {

	public static void main(String[] args) {
		for (int i = 1, j = 1; i <= 100; i++, j++) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
				if (j % 5 == 0) {
					System.out.println();
				}
			}
			

		}
	}
}


/*
 * /for (int i = 0; i <= 100; i++) { if (i % 3 == 0) {
 * System.out.print(i + " "); } }/
 */