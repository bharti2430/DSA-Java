static long trappingWater(int height[], int n) {
        if (height == null || n == 0) {
            return 0;
        }

        long totalWater = 0; // Use long to handle large sums of water
        Stack<Integer> stack = new Stack<>();

        for (int current = 0; current < n; current++) {
            // Remove the elements from the stack while height[current] > height[stack.peek()]
            while (!stack.isEmpty() && height[current] > height[stack.peek()]) {
                int top = stack.pop(); // Remove the top element of the stack
                if (stack.isEmpty()) {
                    break; // If no left boundary, break the loop
                }
                int distance = current - stack.peek() - 1; // Calculate distance between current and the element at the top of the stack
                int boundedHeight = Math.min(height[current], height[stack.peek()]) - height[top]; // Calculate the bounded height
                totalWater += distance * boundedHeight; // Add the trapped water
            }
            stack.push(current); // Push current index to the stack
        }

        return totalWater;
}
