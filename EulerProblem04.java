/*
 * Find the largest palindrome made from the product of two 3-digit numbers.
 * Author: Daniel Galvao Guerra
 * Date: April 27, 2013
 */
public class EulerProblem04 {
	
	public static void main(String[] args)
	{
		new EulerProblem04().run();
	}
	
	// runs the program
	private void run()
	{
		int N = 1000;
		int max = 0;
		
		for(int n1=N-1; n1>0; n1--)
		{
			for(int n2=N-1; n2>0; n2--)
			{
				int product = n1*n2;
				if(isPalindrome(product))
				{
					if(product > max){ max = product; }
				}

			}
		}
		
		System.out.println(max);
		
	}
	
	/*
	 * Checks if a given number is a palindrome by making sure the first digit equals the last, the second equals the second-to-last, etc...
	 * input number the given number to be checked
	 * returns false if input number is not a palindrome, true otherwise
	 */
	private boolean isPalindrome(int number)
	{
		String numString = Integer.toString(number);
		int length = numString.length();
		char[] numArray = numString.toCharArray();
		
		int i=0;
		while(i < length-(i+1))
		{
			if(numArray[i] != numArray[length-(i+1)])
			{
				return false;
			}
			i++;
		}
		
		
		return true;
	}

}
