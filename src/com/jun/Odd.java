package com.jun;

import java.util.Scanner;

public class Odd {

	public static void main(String[] args) {
		System.out.println("�п�J�@�ӼƦr:");
	     Scanner scanner = new Scanner(System.in);
	     String line = scanner.nextLine();
	     int n = Integer.parseInt(line);
	     //�Ȱ��{���B�� ��J
		if (n % 2 == 1){
			System.out.println("�O�_��");
		}else{
			System.out.println("�O����");
		}

	}

}
