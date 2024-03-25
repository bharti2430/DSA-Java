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
