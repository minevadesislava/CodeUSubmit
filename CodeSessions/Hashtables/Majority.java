package sorting.searching.hashtables;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Majority {
	public static void main(String[] args) {
		Integer[] arr1 = {5, 3, 9, 4, 3, 3, 8, 3, 3};
		System.out.println(find(arr1));
		
		Integer[] arr2 = {};
		System.out.println(find(arr2));
		
		Integer[] arr3 = {5, 3, 9, 4, 3, 3, 3, 3};
		System.out.println(find(arr3));
	}
	
	static Integer find(Integer[] arr){
		if(arr.length == 0){
			return null;
		}
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i : arr) {
		    Integer count = map.get(i);
		    map.put(i, count != null ? count+1 : 0);
		}
		if(!hasMajority(arr)){
			return null;
		}
		Integer result = 0;
		for (Map.Entry<Integer, Integer> entry : map.entrySet())
		{
			if(entry.getValue() > result){
				result = entry.getKey();
			}
		}		
		return result;
	}
	
	static boolean hasMajority(Integer[] arr){
		boolean result = false;
		Set<Integer> set = new HashSet<Integer>(Arrays.asList(arr));
		if((arr.length - set.size()) >= (Integer)arr.length/2){
			result = true;
		}
		return result;
	}
}
