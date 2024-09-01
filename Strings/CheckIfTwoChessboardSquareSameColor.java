public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        return getColor(coordinate1)==getColor(coordinate2);
    }
    private static boolean getColor(String coordinate) {
        char column = coordinate.charAt(0); // Get the letter part
        int row = Character.getNumericValue(coordinate.charAt(1)); // Get the number part

        // Convert column to a numerical value (e.g., 'a' -> 1, 'b' -> 2, ...)
        int columnValue = column - 'a' + 1;

        // Check if the sum of column and row is even or odd(even=black)
        return (columnValue + row) % 2 == 0;
    }

Example 1:

Input: coordinate1 = "a1", coordinate2 = "c3"
Output: true
Explanation:
Both squares are black.

Example 2:

Input: coordinate1 = "a1", coordinate2 = "h3"
Output: false
Explanation:
Square "a1" is black and "h3" is white.
