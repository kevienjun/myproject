package com.jun;

import java.util.Scanner;

public class Yolo {

	public static void main(String[] args) {
		System.out.println("以下誰年紀最大?");
		System.out.println("(1)周杰倫");
		System.out.println("(2)華晨宇");
		System.out.println("(3)梁朝偉");
		System.out.println("請輸入一個數字:");
	     Scanner scanner = new Scanner(System.in);
	     String line = scanner.nextLine();
	     int n = Integer.parseInt(line);
	     //暫停程式運行 輸入
		if (n  == 3){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}

	}

	}

