package week1.day2;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the range of Fibonacci Series to display:");
		Scanner input=new Scanner(System.in);
		int n= input.nextInt();
		int a=0,b=1;
		int c;
		for (int i = 0; i < n; i++) {
			
			System.out.print(a+" ");

			c=a+b;
			a=b;
			b=c;
			
		}

	}

}
