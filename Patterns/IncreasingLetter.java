public static void nLetterTriangle(int n) {
        for(int i=0;i<n;i++)
        {
            char ch='A';
            for(int j=0;j<=i;j++)
            {
                System.out.print(ch+" ");
                ch+=1;
            }
            System.out.println();
        }
    }

//output
A 
A B 
A B C 
A B C D 
A B C D E 
A B C D E F 
