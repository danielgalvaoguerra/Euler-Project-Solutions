/*
 * What is the value of the first triangle number to have over five hundred divisors?
 * Author: Daniel Galvao Guerra
 * Date: May 21, 2016
 */
public class EulerProblem12 {

	public static void main(String[] args)
	{
		new EulerProblem12().run();
	}
	
	private void run()
	{		
		int lastTriangleNum = 1;
		int currentTriangleNum = 0;
		
		for(int i=2; i<Integer.MAX_VALUE; i++)
		{
			currentTriangleNum = lastTriangleNum + i;
			
			if(getNumDivisors(currentTriangleNum) > 500)
			{ 
				System.out.println(currentTriangleNum); 
				break; 
			}
			lastTriangleNum = currentTriangleNum;
		}
		
	}
	
	/*
	 * Gets the number of divisor of a given number. Calculates the number of divisors until it reaches the two middle divisors, which means (since the total num of divisors has to be even)
	 *  that the total number of divisors is the (current number of divisors - 1)*2. This decreases run time by 50%
	 */
	private int getNumDivisors(long num)
	{
		int numDiv = 1;	// number of divisors
		int lastDiv = 0; // last divisor (used to check when divisor N/2 has been reached)
		
		for(int i=2; i<num; i++)
		{
			if(num%i==0)
			{ 
				numDiv++; 
				if(i*lastDiv == num){ return (numDiv-1)*2; }
				lastDiv = i;
			}
		}

		return 2; //its prime
	}

}
