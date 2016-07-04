package Algorithms;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class FindWord {
	public static void main(String[] args) throws IOException {
	    Set<String> dictionary = new HashSet<String>(Arrays.asList("the", "of", "and", "a", "to", "in", "is",
			"you", "that", "it", "he", "was", "for", "on", "are", "as", "with", "his", "they", "I", "at", "be", "this",
			"have", "from", "or", "one", "had", "by", "word", "but", "not", "what", "all", "were", "we", "when", "your",
			"can", "said", "there", "use", "an", "each", "which", "she", "do", "how", "their", "if", "will", "up",
			"other", "about", "out", "many", "then", "them", "these", "so", "some", "her", "would", "make", "like",
			"him", "into", "time", "has", "look", "two", "more", "write", "go", "see", "number", "no", "way", "could",
			"people", "my", "than", "first", "water", "been", "call", "who", "oil", "its", "now", "find", "long",
			"down", "day", "did", "get", "come", "made", "may", "part", "a", "man", "am", "an"));
	    
	    //test case - no words from dictionary 
	    System.out.println("Test case no words from dictionary.");
	    String input = "dasdsadasa";
	    List<List<String>> results = new ArrayList<List<String>>();
	    search(input, dictionary, new Stack<String>(), results);
	    if(!results.isEmpty()) {
	    	for (List<String> result : results) {
		        for (String word : result) {
		            System.out.print(word + " ");
		        }
		        System.out.println("(" + result.size() + " words)");
		    }
	    } else {
	    	System.out.println("There aren't any word found.");
	    }
	    
	    //test case - empty string
	    System.out.println("");
	    System.out.println("Test case: empty string");
	    String input2 = "";
	    List<List<String>> results2 = new ArrayList<List<String>>();
	    search(input2, dictionary, new Stack<String>(), results2);
	    if(!results2.isEmpty()) {
	    	for (List<String> result : results2) {
		        for (String word : result) {
		            System.out.print(word + " ");
		        }
		        System.out.println("(" + result.size() + " words)");
		    }
	    } else {
	    	System.out.println("There aren't any word found.");
	    }
	    
	   //test case - words from dictionary
	    System.out.println("");
	    System.out.println("test case: words from dictionary.");
	    String input3 = "didhefindit";
	    List<List<String>> results3 = new ArrayList<List<String>>();
	    search(input3, dictionary, new Stack<String>(), results3);
	    if(!results3.isEmpty()) {
	    	for (List<String> result : results3) {
		        for (String word : result) {
		            System.out.print(word + " ");
		        }
		        System.out.println("(" + result.size() + " words)");
		    }
	    } else {
	    	System.out.println("There aren't any word found.");
	    }
	 
	    //test case
	    System.out.println("");
	    System.out.println("Test case: aman");
	    String input4 = "aman";
	    List<List<String>> results4 = new ArrayList<List<String>>();
	    search(input4, dictionary, new Stack<String>(), results4);
	    if(!results4.isEmpty()) {
	    	for (List<String> result : results4) {
		        for (String word : result) {
		            System.out.print(word + " ");
		        }
		        System.out.println("(" + result.size() + " words)");
		    }
	    } else {
	    	System.out.println("There aren't any word found.");
	    }
	    
	}

	public static void search(String input, Set<String> dictionary, Stack<String> words, List<List<String>> results) {
		if(input.equals("")) {
			return;
		}
	    for (int i = 0; i < input.length(); i++) {
	        String substring = input.substring(0, i + 1);
	        if (dictionary.contains(substring)) {
	            words.push(substring);
	            if (i == input.length() - 1) {
	                results.add(new ArrayList<String>(words));
	            } else {
	                search(input.substring(i + 1), dictionary, words, results);
	            }
	            words.pop();
	        }
	    }
	}
	
}