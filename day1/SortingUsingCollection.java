package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		// Defining a String array with the given strings
		String[] arr = { "HCL", "Wipro", "Aspire Systems", "CTS" };
		// Declaring a List as array list
		List<String> sortList = new ArrayList<>();
		// Adding the elements in the list from the string array
		for (String txt : arr) {
			sortList.add(txt);
		}
		// Sorting the list in ascending order
		Collections.sort(sortList);
		System.out.println("List sorted in ascending order: " + sortList);
		// Declaring a list to store the descending order of strings
		List<String> sortedList = new ArrayList<String>();
		// Iterating through the list which is in ascending order to reverse the order
		for (int i = (sortList.size()) - 1; i >= 0; i--) {
			sortedList.add(sortList.get(i));
		}
		// Printing the descending order of elements in the list
		System.out.println("List sorted in descending order: " + sortedList);
	}

}
