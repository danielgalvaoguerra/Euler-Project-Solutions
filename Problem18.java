/*
 * Find the maximum total sum from top to bottom of the triangle below
 * Author: Daniel Galvao Guerra
 * Date: July 1, 2016
 */
public class Problem18 {
	
	public static void main(String[] args)
	{
		new Problem18().run();
	}
	
	private int[][] triangle = {
									{75},
									{95, 64},
									{17, 47, 82},
									{18, 35, 87, 10},
									{20, 04, 82, 47, 65},
									{19, 01, 23, 75, 03, 34},
									{88, 02, 77, 73, 07, 63, 67},
									{99, 65, 04, 28, 06, 16, 70, 92},
									{41, 41, 26, 56, 83, 40, 80, 70, 33},
									{41, 48, 72, 33, 47, 32, 37, 16, 94, 29},
									{53, 71, 44, 65, 25, 43, 91, 52, 97, 51, 14},
									{70, 11, 33, 28, 77, 73, 17, 78, 39, 68, 17, 57},
									{91, 71, 52, 38, 17, 14, 91, 43, 58, 50, 27, 29, 48},
									{63, 66, 04, 68, 89, 53, 67, 30, 73, 16, 69, 87, 40, 31},
									{04, 62, 98, 27, 23, 9, 70, 98, 73, 93, 38, 53, 60, 04, 23}
								};

	/*
	 * Runs the following algorithm: work from the bottom of the triangle up, and merge rows by adding the current
	 *  number to the biggest one below it, so that each number represents the maximum sum from it to the bottom
	 *  of the triangle. In the end the top of the triangle is the answer
	 */
	void run()
	{

		/*
		 * Goes through the triangle from the second to last row to the top, and from left to right
		 * row is the current row of the triangle
		 * col is the curent column of the triangle
		 */
		for(int row=triangle.length-2; row>=0; row--)
		{
			for(int col=0; col<triangle[row].length; col++)
			{
				// get the biggest number directly below, and add it to the current number
				triangle[row][col] += getMax(triangle[row+1][col], triangle[row+1][col+1]);
			}
		}
		
		System.out.println(triangle[0][0]);
	}
	
	// Returns the maximum of two values
	int getMax(int num1, int num2)
	{
		return (num1 >= num2) ? num1:num2;
	}
	
}
