package week3.day2;

import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr = { 1, 2, 3, 4, 7, 6, 8 };
		
		Set<Integer> s = new TreeSet<Integer>();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s.add(7);
		s.add(6);
		s.add(8);
		System.out.println(s);
		
		int i=0;
		int arr[] = new int[s.size()];
		for (int ele : s)
			arr[i++] = ele;

		for (int j=0; j < arr.length; j++) {
			if (j + 1 != arr[j]) {
				System.out.println(j + 1);
			break;
			}

		}
	}
}

