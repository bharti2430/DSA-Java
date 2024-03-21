public static int bestTimeToBuyAndSellStock(int []prices) {
        // Write your code here.
        int bp=prices[0],profit=0;
        for(int i=1;i<prices.length;i++)
        {
            int currentProfit=0;
            if(bp<prices[i])
            {
                currentProfit=prices[i]-bp;
                profit=Math.max(currentProfit,profit);
            }
            else bp=prices[i];
        }
        return profit;
    }

//output
Sample Input 1:
6
7 1 5 4 3 6


Sample Output 1 :
5
