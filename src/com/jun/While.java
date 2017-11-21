package com.jun;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		System.out.println("請輸入一個數字:");
	     Scanner scanner = new Scanner(System.in);
	     String line = scanner.nextLine();
	     int n = Integer.parseInt(line);
	     int i = 1;
	     while(i <= n){
	    	 System.out.print(i++ + " ");
	    	 if(i==11 ){
	    		 break;
	    	 }
	    	
	     }

	}

}
