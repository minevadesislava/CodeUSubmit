package arrays.and.matrix;

public class Filter {
	  public static int[] evens(int[] input) {
		  int[] result = new int[countEvens(input)];
		  int m=0;
		  for (int i = 0; i < input.length; i++) {
			if(((input[i] % 2) == 0) && m<result.length) {
				result[m]=input[i];
				m++;
				}
		  }
		  return result;
	  }
	  
	  public static int countEvens(int[] arr){
		  int count = 0;
		  for (int i = 0; i < arr.length; i++) {
			  if((arr[i]%2) == 0)  count++;
		}
		  return count;
	  }

	  public static void main(String[] args) {
		  //
		    // Expected output:
		    //  test1 results:
		    //  8
		    //  6
		    //  0
		    //  test2 results:
		    //  2
		    //  18
		    //  28
		    //  18
		    //  28
		    //  90
		    //
		    // STUDENTS, ADD ADDITIONAL TEST CASES BELOW
		    //
		    int[] test1 = {8,6,7,5,3,0,9};
		    int[] ans = evens(test1);
		    System.out.println("test1 results:");
		    for (int i = 0; i < ans.length; ++i) {
		      System.out.println(ans[i]);
		    }
		    int [] test2 = {2,7,18,28,18,28,45,90,45};
		    ans = evens(test2);
		    System.out.println("test2 results:");
		    for (int i = 0; i < ans.length; ++i) {
		      System.out.println(ans[i]);
		    }
		    
		    //test case 3:
		    int[] test3 = {0,6,7,5,3,9,13,289000,600000,2236, 911};
		    ans = evens(test3);
		    System.out.println("test3 results: ");
		    for (int i = 0; i < ans.length; ++i) {
			      System.out.println(ans[i]);
			    } 
		    
		    //test case 4:
		    int[] test4 = {};
		    ans = evens(test4);
		    System.out.println("test4 results: ");
		    for (int i = 0; i < ans.length; ++i) {
			      System.out.println(ans[i]);
			} 
		    
		    //test case 5:
		    int[] test5 = {13, 15, 19, 35, 2, 4, 32};
		    ans = evens(test5);
		    System.out.println("test5 results: ");
		    for (int i = 0; i < ans.length; ++i) {
			      System.out.println(ans[i]);
			} 

	  }
}
