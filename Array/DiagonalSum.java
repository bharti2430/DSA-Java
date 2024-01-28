public class DiagonalSum {

	public static void main(String[] args) {
		int[][] matrix= {{1,2,3,4},
					{5,6,7,8},
					{9,10,11,12},
					{13,14,15,16}};
		int n=4,sum=0;
		for(int i=0;i<n;i++)
		{
			//Primary Diagonal
			sum+=matrix[i][i];
			//secondary diagonal
			if(i!=n-i-1)
				sum+=matrix[i][n-i-1];
		}
		System.out.println("Total Diagonal Sum= "+sum);
	}
}
