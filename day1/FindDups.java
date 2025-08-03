package week3.day1;

import java.util.Arrays;

public class FindDups {

	public static void main(String[] args) {
		// Initialize an integer array 
		int num[]= {2,5,7,7,5,9,2,3};
		//Sorting the array
		Arrays.sort(num);
		System.out.println("The Duplicate Values in the given array are:");
		//Iterating all the values in the array
		for(int i=0;i<num.length;i++)
		{
			// if i = num,length then i+1 will throw ArrayIndexOutOfBoundsException
			//So checking i value using the below condition
			if(i==num.length-1) {
				break;
			}
			//Printing duplicate values in the array
			if(num[i]==num[i+1]) {
				System.out.println(num[i]);
			}
			
		}



	}

}
