package arrays.and.matrix;

public class Zip {
	// Fill in the method "join". It returns a boolean array. The ith
	// value is that array (i.e., array[i]) should be true if the ith
	// value in the first argument to join is divisible by the ith value
	// in the second argument to join. The returned boolean array should
	// be exactly as long as the shorter of the two arguments.
	//
	// Reminders:
	//
	// 1. An integer p is said to be "divisible by" an integer q when there
	// is some integer k such that q*k = p. This is the same as saying
	// "the remainder of p when divided by q is 0". The remainder
	// operator is Java is written with a percent sign: "a % b" is the
	// remainder of a when divided by b.
	//
	// 2. The length of an array bar is stored in bar.length.
	//
	// 3. New arrays are declared with the syntax:
	// float[] foo = new float[8];
	//
	static boolean[] join(int[] y, int[] z) {
	// STUDENTS: WRITE YOUR CODE HERE!
		int num = 0;
		if(y.length < z.length) num = y.length;
		  else num=z.length;
		  boolean[] result = new boolean[num];
		  
		  for(int i=0;i<num;i++){
			  if(z[i]!=0 && (y[i]%z[i]== 0)) result[i]=true;
			  else result[i]=false;
		  }
		  if(result.length == 0) System.out.println("incorrect input.");
		return result;
	}
	public static void main(String[] args) {
	//
	// Expected output:
	// false
	// false
	// false
	// false
	// true
	// false
	// true
	//
	// STUDENTS, ADD ADDITIONAL TEST CASES BELOW
	//
	int euler[] = {2, 7, 18, 28, 18, 28, 45, 90, 45};
	int jenny[] = {8, 6, 7, 5, 3, 0, 9};
	boolean divisibles[] = join(euler, jenny);
	for (int i = 0; i < divisibles.length; ++i) {
	System.out.println(divisibles[i]);
	}
	
	//test case 2
	System.out.println("test case 2:");
	int arr1[] = {1, 3, 5, 7};
	int arr2[] = {2, 4, 6, 8, 11, 49};
	boolean divisibles1[] = join(arr1, arr2);
	for (int i = 0; i < divisibles1.length; ++i) {
	System.out.println(divisibles1[i]);
	}
	
	//test case 3
	System.out.println("test case 3:");
	int arr3[] = {0, 0};
	int arr4[] = {};
	boolean divisibles2[] = join(arr3, arr4);
	for (int i = 0; i < divisibles2.length; ++i) {
	System.out.println(divisibles2[i]);
	}
	
	//test case 4
	System.out.println("test case 4:");
	int arr5[] = {0, 2, 6};
	int arr6[] = {0, 1, 12};
	boolean divisibles3[] = join(arr5, arr6);
	for (int i = 0; i < divisibles3.length; ++i) {
	System.out.println(divisibles3[i]);
	}
	
	}
}
