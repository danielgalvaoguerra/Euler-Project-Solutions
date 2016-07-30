/*
 * What is the largest prime factor of the number 600851475143 ?
 * Author: Daniel Galvao Guerra
 * Date: April 25, 2013
 */
public class EulerProblem03 {
	
	public static void main(String args[])
	{
		new EulerProblem03().run();
	}
	
	private void run()
	{
		long N = 600851475143L;

		/*
		 * Algorithm: Get divisors of number N from largest to smallest, and stop when a prime one is reached (meaning it's the largest prime factor)
		 */
		long i;
		for (i=2; i<=N; i++)
        {
			if(N%i==0)
			{
				N/=i;
				if(isPrime(N))
				{
					System.out.println(N);
					break;
				}
			}
        }
	}
	
	private boolean isPrime(long i)
	{
		for(long j=2; j<i; j++)
		{
			if(i%j==0){ return false; }
		}
		
		return true;
	}

}
