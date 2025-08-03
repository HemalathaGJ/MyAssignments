package week3.day1;

import java.util.Arrays;

public class AnagramCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Defining 2 input Strings
		String text1 = "stops";
		String text2 = "potss";

		/*- Check if the lengths of the two strings are equal
		- If equal, continue; otherwise, print "Lengths mismatch, therefore the strings are not an Anagram" and
		exit*/
		if (text1.length() == text2.length()) {
			// Convert both the Strings to character Arrays
			char[] charArray1 = text1.toCharArray();
			char[] charArray2 = text2.toCharArray();

			// Sorting the two character arrays
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);

			// check if the sorted arrays are equal
			if (Arrays.equals(charArray1, charArray2))
				System.out.println("The given Strings are Anagram");
			else
				System.out.println("The given Strings are not an Anagram");

		} else
			System.out.println("Lengths mismatch.Therefore the strings are not an Anagram");

	}

}
