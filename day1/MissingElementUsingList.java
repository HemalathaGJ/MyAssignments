package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementUsingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1, 2, 3, 4, 10, 6, 8};
		List<Integer> numList=new ArrayList<>();
		for(int ele:arr) {
			numList.add(ele);
		}
		Collections.sort(numList);
		System.out.println(numList);
		for(int i=0;i<(numList.size())-1;i++)
		{
			if(numList.get(i+1)!=(numList.get(i))+1) {
				System.out.println((numList.get(i))+1);
			}
			else
				continue;
		}

	}

}
