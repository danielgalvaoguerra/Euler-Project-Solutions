/*
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 * Author: Daniel Galvao Guerra
 * Date: April 26, 2013
 */
public class EulerProblem06 {

	public static void main(String args[])
	{
		int sum = 0;		// sum of first 100 numbers
		int sumOfSq = 0;	// sum of squares of the first 100 numbers
		
		int N = 100;
		
		for(int i=1; i<=N; i++)
		{
			sum += i;
			sumOfSq += i*i;
		}
		
		int ans = sum*sum - sumOfSq;
		System.out.println(ans);
	}

}
