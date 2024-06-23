// Find the minimum area to cover all 1's
public int minimumArea(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        
        // Initialize boundaries
        int top = rows, bottom = 0, left = cols, right = 0;
        
        // Traverse the grid to find the boundaries of the rectangle
        boolean foundOne = false;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    foundOne = true;
                    if (i < top) top = i;
                    if (i > bottom) bottom = i;
                    if (j < left) left = j;
                    if (j > right) right = j;
                }
            }
        }
        
        // If no 1 is found, return area as 0
        if (!foundOne) {
            return 0;
        }
        
        // Calculate the area of the rectangle
        int height = bottom - top + 1;
        int width = right - left + 1;
        return height * width;
    }

Input: grid = [[0,1,0],[1,0,1]]

Output: 6
