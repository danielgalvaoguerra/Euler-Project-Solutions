/*
 * Computes the longest Collatz sequence starting from a number under 1 million
 * Author: Daniel Galvao Guerra
 * Date: June 21, 2016
 */
public class Problem14 {
	
	public static void main(String[] args)
	{
		new Problem14().run();
	}
	
	/*
	 * Runs both an iterative and recursive algorithm, and calculates the time taken for each algorithm to get the answer
	 * Ex:
	 * Iterative solution got answer: 837799 in 0.38523529300000003 seconds
	 * Recursive solution got answer: 837799 in 0.6677070270000001 seconds
	 */
	private void run()
	{
		// Initializing variables for analyzing elapsed time of each algorithm
		long startTime;
		long endTime;
		
		int N = 1000000;
		
		// variables for comparing Collatz sequences (chains)
		int longestChainLen = 0;
		int tempLen = 0;
		long startingNum = 0L;
		
		// Running iterative algorithm
		startTime = System.nanoTime();
		for(long i=1; i<N; i++)
		{
			tempLen = getChainLengthIterative(i);
			if(tempLen > longestChainLen)
			{
				longestChainLen = tempLen;
				startingNum = i;
			}
		}
		endTime = System.nanoTime();
		System.out.println("Iterative solution got answer: " 
							+ startingNum + 
							" in " + 
							(endTime-startTime)*Math.pow(10, -9)+" seconds");
		
		// reseting variables
		longestChainLen = 0;
		tempLen = 0;
		startingNum = 0L;
		
		// Running recursive solution
		startTime = System.nanoTime();
		for(long i=1; i<N; i++)
		{
			tempLen = getChainLengthRecursive(i,1);
			if(tempLen > longestChainLen)
			{
				longestChainLen = tempLen;
				startingNum = i;
			}
		}
		endTime = System.nanoTime();
		System.out.println("Recursive solution got answer: " + 
							startingNum + 
							" in " + 
							(endTime-startTime)*Math.pow(10, -9)+" seconds");
		
	}
	
	/*
	 * Iterative algorithm: perform while loop from starting number down to 1
	 * return the length of the Collatz chain for n
	 */
	private int getChainLengthIterative(long n)
	{
		int chainLen = 1;
		while(n != 1)
		{	
			if(n%2==0) 	n /= 2;
			else 		n=3*n+1;
			
			chainLen++;
		}
		
		return chainLen;
	}
	
	/*
	 * Recursive algorithm: call itself recursively from starting number to 1
	 * Base case: n = 1
	 * return the length of the Collatz chain for n
	 */
	private int getChainLengthRecursive(long n, int currentChainLen)
	{
		if(n==1){ return currentChainLen; }
		
		if(n%2==0) 	return getChainLengthRecursive(n/2, currentChainLen+1);
		else 		return getChainLengthRecursive(3*n + 1, currentChainLen+1);

	}

}
