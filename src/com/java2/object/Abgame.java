package com.java2.object;

import java.util.Scanner;

public class Abgame {

	public static void main(String[] args) {
		String secret = "5872";
		System.out.println();
		int a = 0;
		int b = 0;
		Scanner scanner = new Scanner(System.in);
		while (a != 4) {
			a = 0;
			b = 0;
			System.out.print("Enater your guess:");
			String numbers = scanner.nextLine();

			int length = numbers.length();
			for (int i = 0; i < secret.length(); i++) {
				char c = secret.charAt(i);
				for (int j = 0; j < length; j++) {
					if (c == numbers.charAt(j)) {
						if (i == j) {
							a++;
						} else {
							b++;
						}
						break;
					}

				}

			}
			System.out.println(a + "A" + b + "B");

		}
	}

}