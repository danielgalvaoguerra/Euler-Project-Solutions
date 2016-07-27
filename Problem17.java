import java.util.Hashtable;

/*
 * If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, 
 * 	how many letters would be used?
 * Author: Daniel Galvao Guerra
 * Date: July 1, 2016
 */
public class Problem17 {
	
	public static void main(String[] args)
	{
		/*
		 * Hashtable containing the length of each number's written out word form
		 * Key: number i.e. 6
		 * Value: length of the written out form of the number i.e. 3 (for "six")
		 */
		Hashtable<Integer, Integer> numsLens = new Hashtable<Integer, Integer>();
		numsLens.put(1, 3);		//one
		numsLens.put(2, 3);		//two
		numsLens.put(3, 5);		//three
		numsLens.put(4, 4);		//four
		numsLens.put(5, 4);		//five
		numsLens.put(6, 3);		//six
		numsLens.put(7, 5);		//seven
		numsLens.put(8, 5);		//eight
		numsLens.put(9, 4);		//nine
		numsLens.put(10, 3);	//ten
		numsLens.put(11, 6);	//eleven
		numsLens.put(12, 6);	//twelve
		numsLens.put(13, 8);	//thirteen
		numsLens.put(14, 8);	//fourteen
		numsLens.put(15, 7);	//fifteen
		numsLens.put(16, 7);	//sixteen
		numsLens.put(17, 9);	//seventeen
		numsLens.put(18, 8);	//eighteen
		numsLens.put(19, 8);	//nineteen
		numsLens.put(20, 6);	//twenty
		numsLens.put(30, 6);	//thirty
		numsLens.put(40, 5);	//forty (according to project euler)
		numsLens.put(50, 5);	//fifty
		numsLens.put(60, 5);	//sixty
		numsLens.put(70, 7);	//seventy
		numsLens.put(80, 6);	//eighty
		numsLens.put(90, 6);	//ninety
		
		int sum = 0;
		
		/*
		 * Go through numbers 1-1000 inclusive
		 */
		for(int i=1; i<=1000; i++)
		{
			int currNum = i; // this is done because we change the number currNum to access its individual 
							 // digits, and we don't want to change the index counter "i"
			
			if(currNum == 1000) // only number with more than 3 digits, so it's a special case
			{
				sum += (3 + 8); // one thousand
			}
			else
			{
				if(Integer.toString(currNum).length() == 3)
				{
					int hundredsDigit = (int)(currNum/100);
					sum += numsLens.get(hundredsDigit); // for example "Seven"
					sum += 7; 							// + "hundred"
					
					currNum = currNum%100;	// ex: 346 becomes 46
					
					if(currNum != 0)
					{
						sum += 3; // + "and"
					}
				}
				
				// now "i" is a 2-digit number
				
				if(currNum != 0) // if number is for example 300, the remainder is zero, 
								 // so there is no more words to print after "three hundred"
				{					
					if(Integer.toString(currNum).length() > 1)
					{
						int tensDigit = (int)(currNum/10); // note: casting as int floors value
						if(tensDigit == 1)
						{
							sum += numsLens.get(currNum);
						}
						else
						{
							sum += numsLens.get(tensDigit*10); // this adds numbers from 10-90
															   // note: it's necessary to divide
															   //  the num by 10 and then multiply by 10
															   //  because we floor it in the division
							
							currNum = currNum%10; // ex: 46 becomes 6
							if(currNum != 0)
							{
								sum += numsLens.get(currNum); // gets last digit, 1-9
							}
						}
					}
					else // if number is only 1 digit in length (for an input like 107)
					{
						if(currNum != 0)
						{
							sum += numsLens.get(currNum); 
						}
					}
				}
			}
		}
		
		System.out.println(sum);
	}

}
