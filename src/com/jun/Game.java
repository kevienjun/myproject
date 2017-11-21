package com.jun;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		for (int a = 1;a>0; a++) {
			System.out.println("請輸入2 4 6 8 0其中一個:");
			Scanner scanner = new Scanner(System.in);
			String line = scanner.nextLine();
			int n = Integer.parseInt(line);

			switch (n) {
			case 8:
				System.out.println("向上");
				break;
			case 4:
				System.out.println("向左");
				break;
			case 6:
				System.out.println("向下");
				break;
			case 2:
				System.out.println("向右");
				break;
			case 0:
				System.out.println("結束程式");
				break;
			default:
				System.out.println("均均好口愛");

			}
			if(n==0){
				break;
			}
		}

	}
}
