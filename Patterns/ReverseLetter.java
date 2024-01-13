public static void nLetterTriangle(int n) {
        // Write your code here
        for(int i=0;i<n;i++)
        {
            char ch='A';
            for(int j=0;j<(n-i);j++)
            {
                System.out.print(ch+" ");
                ch+=1;
            }
            System.out.println();
        }
    }

//output
A B C D E F G 
A B C D E F 
A B C D E 
A B C D 
A B C 
A B 
A 
