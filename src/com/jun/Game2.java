package com.jun;

import java.util.Scanner;

public class Game2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int d = -1;
		int hp = 100;
		int pos = 0;
		int row = 3;
		int col = 5;
		while (d != 0){
			System.out.println("輸入一個數字:");
			String line = scanner.nextLine();
			int i = Integer.parseInt(line);
			switch(i){
			case 8:
				System.out.println("向上");
				if(pos/col <row-1){
					pos = pos+col;
					hp=hp-5;
					System.out.println(hp);
							
				}else{
					hp=hp-30;
					break;
				}
			}
			
		}

	}

}
