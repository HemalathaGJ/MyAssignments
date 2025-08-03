package week3.day1;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		// Declaring input String
		String test = "changeme";
		// Declaring a variable to store the length of the string
		int strlength = test.length();
		// converting the given string to character array
		char[] charArray = test.toCharArray();
		// Declare a character variable to store each character from the character array
		// inside the for loop
		char c;
		// Declare a string variable to store each character as a string inside the loop
		String reversed = "";
		// looping through each character of the string from end to start
		for (int i = strlength - 1; i >= 0; i--) {
			c = charArray[i];
			// condition to check if the index is odd
			if (i % 2 != 0) {
				// if the condition is true change the character to uppercase and concatenate as
				// a string
				reversed = reversed + String.valueOf(Character.toUpperCase(c));
			} else
				// if the condition is false concatenate the character as a string
				reversed = reversed + String.valueOf(c);
			continue;
		}
		// code to reverse the resulted string and display the original string
		StringBuilder sb = new StringBuilder(reversed);
		sb.reverse();
		String original = sb.toString();
		System.out.println("The resulted String after changing the character in the odd index to upper case is: ");
		System.out.println(original);

	}

}
