package arrays.and.matrix;

class Collatz {
	// Consider a sequence of positive integers starting with x. If x is
	// even, the next integer in the sequence is x/2. If x is odd, the
	// next integer in the sequence is 3*x+1. The sequence stops when it
	// reaches 1.
	//
	// For example, if x is 7, the sequence is
	//
	// 7,22,11,34,17,52,26,13,40,20,10,5,16,8,4,2,1
	//
	// Fill in the function loopCount so that it returns the length of
	// the sequence starting from x.
	static int loopCount(int x) {
	// STUDENTS: FILL IN CODE HERE!
int count = 1;
  for (;;) {
	  if(x%2 == 0){
		  x = x/2; 
		  count++;
	  }else if(x == 1){
		  break;
	  }else{
    	  x=3*x + 1;
    	  count++;
      }
 }
  return count;
	}
	// Using loopCount, fill in the function maxLoop so that it returns
	// the maximum sequence length for any sequence that starts with a
	// number greater than or equal to x and less than y.
	static int maxLoop(int x, int y) {
	// STUDENTS: FILL IN CODE HERE!
		int longestSequence = 0;
		while(x <= y){
			int collatzSequenceSize = loopCount(x);
            if(collatzSequenceSize > longestSequence) {
                longestSequence = collatzSequenceSize;
            }
            x++;
		}
		return longestSequence;
	}
	public static void main(String[] args) {
	System.out.println(maxLoop(1,10000));
	}
	}