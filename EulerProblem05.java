/*
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 * Author: Daniel Galvao Guerra
 * Date: April 26, 2013
 */
public class EulerProblem05 {
	
	public static void main(String[] args)
	{
		new EulerProblem05().run();
	}
	
	private void run()
	{
		for(int i=1; i<Integer.MAX_VALUE; i++)
		{
			if(isDiv(i))
			{
				System.out.println(i);
				break;
			}
		}
	}
	
	/*
	 * Checks that a given integer is divisible by all numbers from 1 to 20
	 * note: this is obviously a brute force approach, not all numbers need to be checked as some can be inferred from previous tests
	 *  but time wasn't an issue so I left it as is from my initial brute force approach
	 */
	private boolean isDiv(int number)
	{
		for(int i=1; i<20; i++)
		{
			if(number%i != 0)
			{
				return false;
			}
		}
		return true;
	}

}
