package com.java2.object;

import java.util.Scanner;

public class ABgamenew {
	public static void main(String[] args) {

		String secret = "9837";
		Scanner scanner = new Scanner(System.in);
		int result = 0;
		while (result != 40) {
			System.out.print("Enater your guess:");
			String line = scanner.nextLine();
			ABgamer n = new ABgamer();
			result = n.validate(secret);
			System.out.println((result / 10) + "A" + (result % 10) + "B");

		}

	}
}