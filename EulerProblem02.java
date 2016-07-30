/*
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
 * Author: Daniel Galvao Guerra
 * Date: April 25, 2013
 */
public class EulerProblem02 {

	public static void main(String args[])
	{
		int N = 4000000;
		
		int fibSeq[] = new int[N]; 	// initialize array of size 4 mil (value will exceed 4 mil by a lot)
		fibSeq[0] = 1;
		fibSeq[1] = 2;
		int sum = 2;				// sum of even terms starts at 2 since only 2 is even so far
		
		int i = 2;
		fibSeq[i] = fibSeq[i-1] + fibSeq[i-2];
		/*
		 * While fibSeq[i] the i'th term in the Fibonacci sequence has value <= 4mil,
		 * test if the term is even, and add it to variable 'sum' if it is
		 */
		while(fibSeq[i] <= N)
		{
			if(fibSeq[i]%2==0)
			{
				sum += fibSeq[i];
			}
			
			i++;
			fibSeq[i] = fibSeq[i-1] + fibSeq[i-2];
		}
		
		System.out.println(sum);
	}
}
