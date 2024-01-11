public static void nStarTriangle(int n) {
        // Write your code here
        for(int i=0;i<(2*n-1);i++)
        {
            int stars=i;
            if(i<n-1) {
                for(int j=1;j<=i+1;j++)
                {
                    System.out.print("*");
                }
            }
            else{
                for(int j=1;j<=(2*n-i-1);j++)
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
