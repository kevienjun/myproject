package com.jun.sogo;

public class Tester {

	public static void main(String[] args) {
		Customer c1 = new Customer(1000);
		SilverCustomer c2 = new SilverCustomer(1000);
		GoldenCustomer c3 = new GoldenCustomer(1000);
		c1.print();
		c2.print();
		c3.print();
		
		

	}

}
