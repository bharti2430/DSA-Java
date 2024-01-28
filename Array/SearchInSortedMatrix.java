public class SearchInSortedMatrix 
{
	
	public static void main(String[] args) {
		int[][] matrix= {{1,2,3,4},
					{5,6,7,8},
					{9,10,11,12},
					{13,14,15,16}};
		int m=matrix.length;
		int n=matrix[0].length;
		int row=0,col=n-1,key=4;
		while(row<m && col>=0)
		{
			if(matrix[row][col]==key)
			{
				System.out.println(key+" found at ("+row+","+col+")");
				return;
			}
			else if(matrix[row][col]>key)
				col--;
			else
				row++;
		}
		System.out.println(key+" not found in given matrix.");
	}
}
