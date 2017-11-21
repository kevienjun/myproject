package com.jun;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		System.out.println("請輸入分數:");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int n = Integer.parseInt(line);

		switch (n / 10) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("failed");
			break;
		case 6:
			System.out.println("passed");
			break;
		case 7:
			System.out.println("good");
			break;
		case 8:
			System.out.println("great");
			break;
		case 9:
		case 10:
			System.out.println("exellent");
			break;
		}
		if ((n/10)!=0){
			System.out.println("痘痘那邊~");
			
		}
			
		}

	}


