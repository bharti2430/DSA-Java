public class SpiralMatrix {

	public static void main(String[] args) {
		int[][] matrix= {{1,2,3},
						{5,6,7},
						{9,10,11},
						{100,200,300}};
		int m=matrix.length;
		int n=matrix[0].length;
		int startRow=0,startCol=0,endRow=m-1,endCol=n-1;
		while(startRow<=endRow && startCol<=endCol)
		{
			//top
			for(int i=startCol;i<=endCol;i++)
				System.out.print(matrix[startRow][i]+" ");
			//right
			for(int i=startRow+1;i<=endRow;i++)
				System.out.print(matrix[i][endCol]+" ");
			//bottom
			for(int i=endCol-1;i>=startCol;i--)
			{
				if(startRow==endRow)
					break;
				System.out.print(matrix[endRow][i]+" ");
			}
			//left
			for(int i=endRow-1;i>=startRow+1;i--)
			{
				if(startCol==endCol)
					break;
				System.out.print(matrix[i][startCol]+" ");
			}
			startRow++;
			startCol++;
			endRow--;
			endCol--;
		}
	}
}
