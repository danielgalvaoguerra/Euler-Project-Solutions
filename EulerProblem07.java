/*
 * What is the 10 001st prime number?
 * Author: Daniel Galvao Guerra
 * Date: April 26, 2013
 */
public class EulerProblem07 {
	
	public static void main(String args[])
	{
		new EulerProblem07().run();
	}
	
	private void run()
	{
		int i = 1;
		int primeCounter = 0;
		
		while(primeCounter < 10001)
		{
			i++;			// must be at the top of loop so after final loop 1 is not added to the real answer
			if(isPrime(i))
			{ 
				primeCounter++;
			}
		}
		System.out.println(i);
	}

	private boolean isPrime(int i)
	{
		for(int j=2; j<i; j++)
		{
			if(i%j==0){ return false; }
		}
		
		return true;
	}

}
