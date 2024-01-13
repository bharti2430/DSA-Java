public static void alphaTriangle(int n) {
        // Write your code here
        for(int i=0;i<n;i++)
        {
            for(char ch=(char)(int)('A'+n-1);ch>=(char)(int)('A'+n-1-i);ch--)
            {
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }

//output
G 
G F 
G F E 
G F E D 
G F E D C 
G F E D C B 
G F E D C B A 
