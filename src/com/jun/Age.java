package com.jun;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		System.out.println("請輸入你的年齡:");
        Scanner scanner = new Scanner (System.in);
        String line = scanner.nextLine();
        int age = Integer.parseInt(line);
        if (age < 12){
       
        System.out.println("小學屁孩?");
	}else{
		if (age < 15){
			System.out.println("國中屁孩?");
		}else{
			if (age < 18){
			System.out.println("高中屁孩?");
			}else{
				System.out.println("好老喔你");
				for (int i=1; i<=5; i=i+1){
					System.out.println("YOLO");
					
				}
			}
			}
	}
	}
}
