package com.ibm;

import java.util.Random;
import java.util.Scanner;

public class Dice {

	public static void main(String[] args) {
		for (int i = 1, j = 1; i <= 10; i++, j++) {
			Random r = new Random();
			int r1 = r.nextInt(6) + 1;
			int r2 = r.nextInt(6) + 1;
			int r3 = r.nextInt(6) + 1;
			int r4 = r.nextInt(6) + 1;

			System.out.print(r1 + " ");
			System.out.print(r2 + " ");
			System.out.print(r3 + " ");
			System.out.print(r4 + " ");
			if ((r1 != r2) && r1 != r3 && r1 != r4 && r2 != r3 && r2 != r4 && r3 != r4) {
				System.out.print("*");
			}
			if (j % 1 == 0) {
				System.out.println();
			}

		}

	}
}
