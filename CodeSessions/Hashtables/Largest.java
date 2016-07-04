package sorting.searching.hashtables;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Largest {
	ArrayList<Integer> array;
	
	Largest(ArrayList<Integer> arr){
		this.array = arr;
	}
	
	void nthLargest(Integer i){
		if(array.size() == 0 || (i > array.size() -1)){
			throw new IllegalArgumentException("Invalid input!");
		}
		Set<Integer> set = new HashSet<Integer>(array);
		List<Integer> list = new ArrayList<Integer>(set);
		System.out.println("The elemnt at index " + i + " is " + list.get(list.size() - i));

	}
	
	public static void main(String[] args) {
		ArrayList<Integer> arr =  new ArrayList<Integer>(Arrays.asList(5, 3, 9, 4, 3, 3, 8, 3, 3));
		Largest largest = new Largest(arr);
		largest.nthLargest(1);
		largest.nthLargest(4);
	}
}


