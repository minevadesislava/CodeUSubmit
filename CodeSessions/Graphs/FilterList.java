package lists.trees.and.graphs;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class FilterList {
	// Write a function named "evens" that takes as input a
	// list of Integer (almost but not quite int) and returns
	// a new list of ints containing only the even elements
	// of the input.
	public static List<Integer> evens(List<Integer> input) {
		List<Integer> result = new ArrayList<Integer>();
		for (Iterator iterator = input.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			if ((integer % 2) == 0) {
				result.add(integer);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		List<Integer> test1 = new ArrayList<Integer>(Arrays.asList(8, 6, 7, 5, 3, 0, 9));
		List<Integer> ans = evens(test1);
		// Expected output: 8, 6, 0
		for (Integer n : ans) {
			System.out.print(Integer.valueOf(n) + ", ");
		}
		System.out.println();
		List<Integer> test2 = new ArrayList<Integer>(Arrays.asList(2, 7, 18, 28, 18, 28, 45, 90, 45));
		ans = evens(test2);
		// Expected output: 2, 18, 28, 18, 28, 90
		for (Integer n : ans) {
			System.out.print(Integer.valueOf(n) + ", ");
		}
		System.out.println();
		// STUDENTS: ADD YOUR TEST CASES HERE.
		//test case with empty list , expected output: "Empty array test."
		List<Integer> test3 = new ArrayList<Integer>();
		ans = evens(test3); 
		if(ans.size() == 0){
			System.out.println("Empty array test.");
		}
		//test case with negative numbers, expected output: -2, -18, -28, -18, -28, -90,
		List<Integer> test4 = new ArrayList<Integer>(Arrays.asList(-2, 7, -18, -28, -18, -28, 45, -90, 45));
		ans = evens(test4); 
		for (Integer n : ans) {
			System.out.print(Integer.valueOf(n) + ", ");
		}
		System.out.println();
		
		
	}
}