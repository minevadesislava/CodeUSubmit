package Algorithms;

public class StringPalindrome { 
	    public static String subPalindrome(String string, int left, int right) {
	        if (left > right) return null;
	        while (left >= 0 && right < string.length() && string.charAt(left) == string.charAt(right)) {
	            left--;
	            right++;
	        }
	        return string.substring(left + 1, right);
	    }
	 
	    public static String longestStringPalindrome(String string) {
	        if (string == null) return null;
	        String longest = string.substring(0, 1);
	        for (int i = 0; i < string.length() - 1; i++) {
	            String palindrome = subPalindrome(string, i, i);
	            if (palindrome.length() > longest.length()) {
	                longest = palindrome;
	            }
	            palindrome = subPalindrome(string, i, i + 1);
	            if (palindrome.length() > longest.length()) {
	                longest = palindrome;
	            }
	        }
	        return longest;
	    }
	    
	    public static void main(String[] args) {
	        System.out.println(longestStringPalindrome("1234"));
	        System.out.println(longestStringPalindrome("12321"));
	        System.out.println(longestStringPalindrome("9912321456"));
	        System.out.println(longestStringPalindrome("9912333321456"));
	        System.out.println(longestStringPalindrome("12145445499"));
	        System.out.println(longestStringPalindrome("1223213"));
	        System.out.println(longestStringPalindrome("abb"));
	    }
}
