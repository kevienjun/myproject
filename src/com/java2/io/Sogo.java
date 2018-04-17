package com.java2.io;

import java.util.Scanner;

public class Sogo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		showFunctions();
		int function = scanner.nextInt();
		switch(function){
		case 1:
			inputSales();
		case 2:
			
		case 3:
			return;
		}

	}
	public static void showFunctions(){
		System.out.println("請輸入功能(1~3):");
		int type = scanner.nextInt();
		System.out.println("1.請輸入銷售紀錄:");
		System.out.println("2.印出銷售報表:");
		System.out.println("3.結束程式");
	}

}
