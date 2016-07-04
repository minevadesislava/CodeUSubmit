package sorting.searching.hashtables;

import java.util.HashSet;

public class Dictionary {
	HashSet<String> already_found = new HashSet<String>();

	boolean isInDictionary(String word) {
		boolean result = false;
		if (already_found.contains(word)) {
			result = true;
		}
		for (int i = 0; i < TrivialDictionary.dictionary.length; i++) {
			if(TrivialDictionary.wordAt(i).equals(word)){
				already_found.add(word);
				result = true;
				break;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Dictionary test = new Dictionary();
		//test with word in dictionary
		System.out.println(test.isInDictionary("find"));
		//test with word not in dictionary
		System.out.println(test.isInDictionary("Lorem Ipsum"));
		//test with empty word
		System.out.println(test.isInDictionary(""));
		//test again
		System.out.println(test.isInDictionary("find"));
		
	}
}

class TrivialDictionary {
	static String[] dictionary = {"the", "of", "and", "a", "to", "in", "is",
			"you", "that", "it", "he", "was", "for", "on", "are", "as", "with", "his", "they", "I", "at", "be", "this",
			"have", "from", "or", "one", "had", "by", "word", "but", "not", "what", "all", "were", "we", "when", "your",
			"can", "said", "there", "use", "an", "each", "which", "she", "do", "how", "their", "if", "will", "up",
			"other", "about", "out", "many", "then", "them", "these", "so", "some", "her", "would", "make", "like",
			"him", "into", "time", "has", "look", "two", "more", "write", "go", "see", "number", "no", "way", "could",
			"people", "my", "than", "first", "water", "been", "call", "who", "oil", "its", "now", "find", "long",
			"down", "day", "did", "get", "come", "made", "may", "part"};

	static String wordAt(int index) {
		return dictionary[index];
	}
}