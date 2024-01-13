public static void nBinaryTriangle(int n) {
        // Write your code here.
        int binary=1;
        for(int i=1;i<=n;i++)
        {
            if(i%2==0) binary=0;
            else binary=1;
            for(int j=0;j<i;j++)
            {
                System.out.print(binary+" ");
                binary=1-binary;
            }
            System.out.println();
        }
    }

//output
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
