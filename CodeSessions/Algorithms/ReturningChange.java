package Algorithms;

public class ReturningChange {
	
	static private int makeChange(int amount, int[] coins) {
		return makeChange(amount, coins, 0);
	}
	
	static private int makeChange(int amount, int[] coins, int checkFromIndex) {
		 if (amount == 0)
		        return 1;
		    else if (amount < 0 || coins.length == checkFromIndex)
		        return 0;
		    else {
		        int withFirstCoin = makeChange(amount-coins[checkFromIndex], coins, checkFromIndex);
		        int withoutFirstCoin = makeChange(amount, coins, checkFromIndex+1);
		        return withFirstCoin + withoutFirstCoin;
		    }
	}
	
	public static void main(String[] args) {
		int[] arr = {2, 3, 5};
		System.out.println(makeChange(10, arr));
	}
}
