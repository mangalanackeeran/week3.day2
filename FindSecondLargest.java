package week3.day2;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> s = new TreeSet<Integer>();
		s.add(3);
		s.add(2);
		s.add(11);
		s.add(4);
		s.add(6);
		s.add(7);
		System.out.println(s);

		int arr[] = new int[s.size()];

		int l = s.size() - 2;

		int i = 0;
		/*
		 * Converting the set into array
		 */

		for (int ele : s)
			arr[i++] = ele;

		// Finding the Second Largest number
		System.out.print(arr[l]);

	}

}
