package com.jun.sogo;

import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		ArrayList<Customer> customers = new ArrayList<>();
		customers.add(new Customer(10000));
		customers.add(new SilverCustomer(10000));
		customers.add(new GoldenCustomer(10000));
		for (int i = 0; i < customers.size(); i++) {
			Customer c = customers.get(i);
			c.print();
		}
		ArrayList<Integer> list = new ArrayList<>();
		list.add(94);
		list.add(87);
		list.add(55);
		list.add(4);
		int n = list.get(2);
		int n2 = list.get(3);
		System.out.println(list.get(1));
		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		/*
		 * / Customer c1 = new Customer(1000); SilverCustomer c2 = new
		 * SilverCustomer(1000); GoldenCustomer c3 = new GoldenCustomer(1000);
		 * c1.print(); c2.print(); c3.print();/
		 */

	}

}
