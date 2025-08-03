package week3.day1;

public class CharacterCountInString {

	public static void main(String[] args) {
		// Declare and Initialize an input String variable
		String input="TestLeaf";
		//Initialize an integer variable as 0
		int count=0;
		//Convert the String to a character array
		char[] charArray = input.toCharArray();
		//iterate through the character array to find the no. of occurence of 'e' in the given String
		for(int i=0;i<input.length();i++) {
			//condition to check if the character at the index position is equal to 'e'
			if(charArray[i]=='e') {
				//if the condition is true increment count by 1
				count=count+1;
			}
		}
		//print the no. of occurrence of 'e' in the String TestLeaf
		System.out.println("The count of 'e' in the String TestLeaf is: "+count);

	}

}
