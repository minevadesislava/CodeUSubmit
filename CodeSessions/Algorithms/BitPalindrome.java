package Algorithms;

public class BitPalindrome {
	
	static private boolean isPalindrome(String str) {
		int length = str.length();
		if((length % 2 == 0) && (str.substring(0,length/2)).equals(str.substring(length/2))) {
			return true;
		} else if((str.substring(0,length/2)).equals(str.substring((length/2) + 1))) {
			return true;
		}
		return false;
	}
	
	static int nPalindrome(int count){
		for(int i = 0;; i++) {
			if(isPalindrome(Integer.toBinaryString(i))) count--;
			if(count < 0) {
				return i;
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println(nPalindrome(1));
		System.out.println(nPalindrome(2));
		System.out.println(nPalindrome(3));
		System.out.println(nPalindrome(4));
	}
}
