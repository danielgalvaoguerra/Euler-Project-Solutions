/*
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000. Find the product abc.
 * Author: Daniel Galvao Guerra
 * Date: April 27, 2013
 */
public class EulerProblem09 {
	
	public static void main(String[] args)
	{
		for(int a=1; 	a<1000; a++){ 
		for(int b=a+1; 	b<1000; b++){ 
		for(int c=b+1; 	c<1000; c++){
			
			if((a*a + b*b == c*c) && (a+b+c == 1000))
			{
				System.out.println(a*b*c);
				break;
			}
			
		}}}
	}

}
