public int maximalRectangle(char[][] matrix) {
        int[][] mat=convertCharMatrixToIntMatrix(matrix);
        int maxArea=largestRectangleArea(mat[0]);
        int rows = mat.length;
        int cols = mat[0].length;
        for(int i=1;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(mat[i][j]!=0) mat[i][j]=mat[i][j]+mat[i-1][j];
                else mat[i][j]=0;
                int area=largestRectangleArea(mat[i]);
                maxArea=Math.max(maxArea,area);
            }
        }
        return maxArea;
    }
    
    private static int[][] convertCharMatrixToIntMatrix(char[][] charMatrix) {
        int rows = charMatrix.length;
        int cols = charMatrix[0].length;
        int[][] intMatrix = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                intMatrix[i][j] = charMatrix[i][j] - '0';
            }
        }
        
        return intMatrix;
    }
    private int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        
        for (int i = 0; i <= n; i++) {
            int h = (i == n ? 0 : heights[i]);
            while (!stack.isEmpty() && h < heights[stack.peek()]) {
                int height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, height * width);
            }
            stack.push(i);
        }
        
        return maxArea;
    }

Input: matrix = [["1","0","1","0","0"],["1","0","1","1","1"],["1","1","1","1","1"],["1","0","0","1","0"]]
Output: 6
