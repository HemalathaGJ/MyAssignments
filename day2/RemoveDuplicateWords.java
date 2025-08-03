package week3.day2;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		// Define the input String
		String text = "We learn Java basics as part of java sessions in java week1";
		// Initialize an integer variable count to keep track of the no. of duplicate
		// words
		int count = 0;
		// Split the text into an array of words using space as the delimiter
		String[] split = text.split(" ");
		// Define a String variable modified by initializing it as empty String
		String modified = "";

		// Creating two nested for loops to compare each word with every other word in
		// the String array
		for (int i = 0; i < split.length; i++) {
			for (int j = i + 1; j < split.length; j++) {
				// If a duplicate word is found, it is replaced with an empty string and the
				// count is incremented by 1
				if (split[i].equalsIgnoreCase(split[j])) {

					split[j] = " ";
					count = count + 1;
				} else
					continue;

			}
		}
		// If count is greater than 1 print the modified words array
		if (count > 1) {
			for (int k = 0; k < split.length; k++) {
				modified = modified + " " + split[k];
			}
			System.out.println("Modified String is: " + modified);
		} else
			// if condition is false print the given text
			System.out.println(text);

	}

}
