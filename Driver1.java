package com.problem1;

import java.util.LinkedList;

import java.util.Scanner;

public class Driver1 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		OrderOfConstruction oc = new OrderOfConstruction();

	
		LinkedList<Integer> ls_original = new LinkedList<>();

		System.out.println("Enter the total number of floors in building");
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			System.out.println("Enter the floor size given on day " + (i + 1));
			ls_original.add(sc.nextInt());
		}
		oc.orderConstruction(ls_original);
		sc.close();
	}
}