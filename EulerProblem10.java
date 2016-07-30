/*
 * Find the sum of all the primes below two million
 * Author: Daniel Galvao Guerra
 * Date: May 19, 2016
 */
public class EulerProblem10 {

	public static void main(String[] args)
	{
		
		new EulerProblem10().run();
	}
	
	private int N = 2000000;
	private long sum = 2;	// will skip 2 since isPrime method checks first that number is not divisible by 2
	
	private long i = 3;
	
	private void run()
	{
		while(i < N)
		{
			if(isPrime(i))
			{
				sum += (long)i;
			}
			i++;
		}
		System.out.println("Answer: "+sum);
	}

	private boolean isPrime(long i)
	{
		if(i%2==0) return false; 

		for(int j=3; j<=Math.sqrt(i); j+=2) // if a given number N isn't divisible by anything under or equal to sqrt(N) (not couting 1) it won't be divisible by anything above it since sqrt(N)*sqrt(N) = N.
											// This means it's prime
		{
			if(i%j==0){ return false; }
		}
		
		return true;
	}
	
}
