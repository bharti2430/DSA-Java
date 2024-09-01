public int[] resultsArray(int[][] queries, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        int[] results = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int x = queries[i][0];
            int y = queries[i][1];
            int distance = Math.abs(x) + Math.abs(y);

            // Add the current distance to the max heap
            if (maxHeap.size() < k) {
                maxHeap.offer(distance);
            } else if (distance < maxHeap.peek()) {
                maxHeap.poll();
                maxHeap.offer(distance);
            }

            // After each query, check if we have k elements
            if (maxHeap.size() < k) {
                results[i] = -1;
            } else {
                results[i] = maxHeap.peek();
            }
        }

        return results;
    }

Input: queries = [[1,2],[3,4],[2,3],[-3,0]], k = 2

Output: [-1,7,5,3]

Explanation:

Initially, there are 0 obstacles.
After queries[0], there are less than 2 obstacles.
After queries[1], there are obstacles at distances 3 and 7.
After queries[2], there are obstacles at distances 3, 5, and 7.
After queries[3], there are obstacles at distances 3, 3, 5, and 7.
