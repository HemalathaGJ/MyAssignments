package week4.day1;

import java.util.ArrayList;
import java.util.List;

public class IntersectionUsingList {

	public static void main(String[] args) {
		// Defining 2 arrays of type Integer
		int[] firstArr = { 3, 2, 11, 4, 6, 7 };
		int[] secondArr = { 1, 2, 8, 4, 9, 7 };
		// Defining 2 lists as ArrayList
		List<Integer> firstList = new ArrayList<>();
		List<Integer> secondList = new ArrayList<>();
		// Adding the elements of first array to first list
		for (int ele : firstArr) {
			firstList.add(ele);
		}
		// Adding the elements of second array to second list
		for (int ele : secondArr) {
			secondList.add(ele);
		}
		/*
		 * Iterating the values through the length of the two lists using nested for
		 * loop
		 */
		for (int i = 0; i < firstList.size(); i++) {
			for (int j = 0; j < secondList.size(); j++) {
				// Checking the element of firstList with each element in secondList
				if (firstList.get(i) == secondList.get(j)) {
					// Printing the element which is common in both the lists
					System.out.println(firstList.get(i));
				} else
					continue;
			}
		}
	}
}
