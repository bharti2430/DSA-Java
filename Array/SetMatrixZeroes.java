//BRUTE

static void markRow(ArrayList<ArrayList<Integer>> matrix, int n, int m, int i) {
        // set all non-zero elements as -1 in the row i:
        for (int j = 0; j < m; j++) {
            if (matrix.get(i).get(j) != 0) {
                matrix.get(i).set(j, -1);
            }
        }
    }
    static void markCol(ArrayList<ArrayList<Integer>> matrix,int n,int m,int j)
    {
        for(int i=0;i<n;i++)
        {
            if(matrix.get(i).get(j)!=0)
            {
                matrix.get(i).set(j,-1);
            }
        }
    }
    public static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, Integer n, Integer m) {
    	// Write your code here.
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(matrix.get(i).get(j)==0)
                {
                    markRow(matrix,n,m,i);
                    markCol(matrix,n,m,j);
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(matrix.get(i).get(j)==-1)
                    matrix.get(i).set(j,0);
            }
        }
        return matrix;
    }

//BETTER
public static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, Integer n, Integer m) {
    	int[] row=new int[n];
        int[] col=new int[m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(matrix.get(i).get(j)==0)
                {
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(row[i]==1 || col[j]==1)
                {
                    matrix.get(i).set(j,0);
                }
            }
        }
        return matrix;
    }

//OPTIMAL
public static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, Integer n, Integer m) {
        int col0=1;
    	for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(matrix.get(i).get(j)==0)
                {
                    matrix.get(i).set(0,0);
                    if(j==0) col0=0;
                    else matrix.get(0).set(j,0);
                }
            }
        }
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<m;j++)
            {
                if(matrix.get(i).get(j)!=0)
                {
                    if(matrix.get(i).get(0)==0 || matrix.get(0).get(j)==0)
                        matrix.get(i).set(j,0);
                }
            }
        }
        if (matrix.get(0).get(0) == 0) {
            for (int j = 0; j < m; j++) {
                matrix.get(0).set(j, 0);
            }
        }
        if (col0 == 0) {
            for (int i = 0; i < n; i++) {
                matrix.get(i).set(0, 0);
            }
        }

        return matrix;
    }
