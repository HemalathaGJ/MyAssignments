package week3.day1;

public class FindIntersection {

	public static void main(String[] args) {

		// Declaring two integer arrays
		int a[] = { 3, 2, 11, 4, 6, 7 };
		int b[] = { 1, 2, 8, 4, 9, 7 };
		System.out.println("The following are the same elements the given 2 arrays");

		// Declaring for loop iterator from 0 to array length
		for (int i = 0; i < a.length; i++) {
			// Declare a nested for another array from 0 to array length
			for (int j = 0; j < b.length; j++) {
				// condition to check if the element in array 1 is equal to the element in the
				// array2
				if (a[i] == b[j]) {
					// if the condition is true print the value from the first array
					System.out.println(a[i]);

				} else
					continue;
			}

		}

	}

}
