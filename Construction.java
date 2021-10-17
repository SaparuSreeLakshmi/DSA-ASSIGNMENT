package com.problem1;

import java.util.Collections;

import java.util.LinkedList;

public class Construction {
	LinkedList<Integer> tempList = new LinkedList<>();
public void orderConstruction(LinkedList<Integer> ls_original) {
		for (int i = 0; i < ls_original.size(); i++) {
			tempList.add(ls_original.get(i));
		}
		
		Collections.sort(tempList, Collections.reverseOrder());
		int j = 0;
		
		for (int i = 0; i < ls_original.size(); i++) {
		if (ls_original.get(i) != tempList.get(j))
		System.out.println("Day: " + (i + 1));
		else if (ls_original.get(i) == tempList.get(j)) {
System.out.print("Day: " + (i + 1) + " -----> " + tempList.get(j) + ", ");
				j++;
				try {
			for (int k = 0; k < i; k++) {
		if (ls_original.get(k) == tempList.get(j)) {
							System.out.print(tempList.get(j) + ", ");
							j++;
							k = -1;
						}
					}
				} catch (IndexOutOfBoundsException e) {
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}