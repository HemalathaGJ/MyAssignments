package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestNumberUsingList {

	public static void main(String[] args) {
		// Defining an integer array with the given elements
		int[] arr = { 3, 2, 11, 4, 6, 7 };
		// Defining an integer List as an array list
		List<Integer> numList = new ArrayList<>();
		// Adding the array elements to the list
		for (int ele : arr) {
			numList.add(ele);
		}
		// Sorting the list in ascending order
		Collections.sort(numList);
		// Printing the sorted list
		System.out.println("Sorted array: " + numList);
		// Getting the length of the List
		int count = numList.size();
		// Finding the second largest element and printing it
		Integer secondLargest = numList.get(count - 2);
		System.out.println("Second Largest Element in the given array is: " + secondLargest);

	}

}
