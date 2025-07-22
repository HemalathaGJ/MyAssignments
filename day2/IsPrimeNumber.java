package week1.day2;

import java.util.Scanner;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number greater then 2 to check if it is Prime or not");
		Scanner num = new Scanner(System.in);
		int n = num.nextInt();
		int flg = 0;
		boolean prime = true;

		for (int i = 2; i < n; i++) {
			if (i != n) {
				if (n % i == 0) {
					// System.out.println("The number" + " " + n + " is not Prime");

					System.out.println("The number" + " " + n + " is not Prime");
					prime = false;
					break;

				} else
					continue;

			}
		}
		if (prime) {
			System.out.println("The number" + " " + n + " is Prime");
		}

	}

}
