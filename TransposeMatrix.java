//write a java program to find transpose of a given matrix.

public class TransposeMatrix
{
	public static void main(String args[])
	{
		int row=2;
		int column=3;
		
		int[][] matrix= {{1,2,3},{4,5,6}};					//give value of matrix
		display(matrix);
		
		int[][] transpose = new int[column][row];				//transpose matrix
		for (int i=0;i<row;i++)
		{
			for (int j=0;j<column;j++)
			{
				transpose[j][i]=matrix[i][j];
			}
		}
		
		display(transpose);						//display transpose matrix
	}
	
	public static void display(int[][] matrix)
	{
		System.out.println("matrix is :");
		for (int [] row:matrix)
		{
			for (int column:row)
			{
				System.out.println(column+"");
			}
			System.out.println();
		}
	}

}
		