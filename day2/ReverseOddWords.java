package week3.day2;

public class ReverseOddWords {
	// Method to reverse character array
	public void reverseCharArray(char[] charArray) {
		int a = 0;
		int b = charArray.length - 1;
		// while loop to continue as long as a<b
		while (a < b) {
			// Swap characters
			char temp = charArray[a];
			charArray[a] = charArray[b];
			charArray[b] = temp;

			// Move the position of left index by incrementing
			a++;
			// Move the position of right index by decrementing
			b--;
		}
	}

	public static void main(String[] args) {
		// Creating an object for the ReversedOddWords class to access the
		// reverseCharArray method
		ReverseOddWords reverse = new ReverseOddWords();
		// Defining the input String
		String text = "I am a software tester";
		// Defining a String variable to store the modified String
		String reversed = "";
		// Split the given text and store as a String array
		String[] split = text.split(" ");
		// Iterate through the String array
		for (int i = 0; i < split.length; i++) {
			// condition to find the odd index
			if (i % 2 != 0) {
				// if the condition is true split the String in the odd index of the String
				// array to a character array
				char[] charArray = split[i].toCharArray();
				// Invoke the method using the object
				reverse.reverseCharArray(charArray);
				// Concatenate the reversed String and store it in the output String variable
				reversed = reversed + new String(charArray) + " ";
			} else
				// for even indexed words concatenate the text without reversing
				reversed = reversed + split[i] + " ";
		}
		// Print the output String
		System.out.println("Output String with reversed odd words is: " + reversed);

	}

}
