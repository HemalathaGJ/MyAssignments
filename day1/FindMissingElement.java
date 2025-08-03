package week3.day1;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// Declaring an input array with sequential values
		int input[] = { 1, 4, 3, 2, 8, 6, 7 };
		// Declaring a variable to store the length of the input array
		int arrlength = input.length;
		// sorting the array
		Arrays.sort(input);
		System.out.println("The missing number in the given array is: ");
		// looping through the array from 0 to the length of the array
		for (int i = 0; i < arrlength; i++) {
			// check if the iterator value is equal to the array value
			if (input[i] == i + 1) {
				// if the condition is true then continue to the next iteration
				continue;
			} else {
				// if the condition is false print the iterator value+1(since i starts from 0)
				// as the missing value
				int missingValue = i + 1;
				System.out.println(missingValue);
				// exit the iteration
				break;
			}

		}

	}

}
