/*
 * Computes the number of unique paths going from the top-left to the bottom-right edge of a 20x20 grid
 * Author: Daniel Galvao Guerra
 * Date: June 21, 2016
 */
public class Problem15 {

	public static void main(String[] args)
	{
		/*
		 * A node is a vertex in a grid. An NxN grid contains N+1 x N+1 nodes
		 * This array contains the number of paths that go through each node. Nodes[20][20] will be the answer.
		 * Convention: nodes[node x-position][node y-position]
		 */
		long[][] nodes = new long[21][21];
		
		// Fills left-most and top-most edge of node array with 1's as it is known only one path goes through them
		for(int fillerIdx=0; fillerIdx<nodes.length; fillerIdx++)
		{
			nodes[0][fillerIdx] = 1L;
			nodes[fillerIdx][0] = 1L;
		}
		
		// Calculates node value by adding the values of the nodes above, and the node to the left, of the current node
		// This is possible because paths can only go down or right
		for(int y=1; y<nodes.length; y++)
		{
			for(int x=1; x<nodes[0].length; x++)
			{
				nodes[x][y] = (long)nodes[x-1][y] + (long)nodes[x][y-1];
			}
		}
		
		System.out.println("Number of Paths: " + nodes[20][20]);
	}
	
}
