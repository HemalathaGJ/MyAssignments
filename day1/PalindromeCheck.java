package week2.day1;

import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number to check if it is Palindrome or not:");
		Scanner num = new Scanner(System.in);
		int input = num.nextInt();
		int output = 0;
		int rem;
		for (int i = input; i > 0; i /= 10) {
			rem = i % 10;
			output = output * 10 + rem;
		}
		if (input == output) {
			System.out.println("The given number is a Palindrome");
		} else
			System.out.println("The given number is not a Palindrome");

	}

}
