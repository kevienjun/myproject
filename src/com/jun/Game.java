package com.jun;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		for (int a = 1;a>0; a++) {
			System.out.println("�п�J 2 4 6 8 �䤤�@�Ӥ�V:");
			Scanner scanner = new Scanner(System.in);
			String line = scanner.nextLine();
			int n = Integer.parseInt(line);

			switch (n) {
			case 8:
				System.out.println("�V�W");
				break;
			case 4:
				System.out.println("�V��");
				break;
			case 6:
				System.out.println("�V�k");
				break;
			case 2:
				System.out.println("�V�U");
				break;
			case 0:
				System.out.println("����");
				break;
			default:
				System.out.println("??????");

			}
			if(n==0){
				break;
			}
		}

	}
}
