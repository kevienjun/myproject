package com.java2.object;

import java.util.Random;

public class PokerTester {

	public static void main(String[] args) {
		Random random = new Random();
		String flowers ="SHDC";
		int[] cards= new int[52];
		for (int i=0;i<cards.length; i++){
			
			cards[i] = i;
			System.out.println((i%13)+1 + " "+ (flowers.charAt(i/13)));
		}

	}

}
