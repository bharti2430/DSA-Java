static ArrayList<Integer> recamanSequence(int n){
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        int PrevTerm=0;
        list.add(0);
        for(int i=1;i<n;i++)
        {
            int CurrTerm=PrevTerm-i;
            if(CurrTerm<0 || list.contains(CurrTerm))
            {
                CurrTerm=CurrTerm+(2*i);
                list.add(CurrTerm);
            }
            else
            list.add(CurrTerm);
            PrevTerm=CurrTerm;
        }
        return list;
    }

//output

n = 5
Output: 
0 1 3 6 2
Explaination: 
a(0) = 0,
a(1) = a(0)-1 = 0-1 = -1 and -1<0, therefore a(1) = a(0)+1 = 1,
a(2) = a(1)-2 = 1-2 = -1 and -1<0, therefore a(2) = a(1)+2 = 3,
a(3) = a(2)-3 = 3-3 = 0 but since 0 is already present in the sequence, a(3) = a(2)+3 = 3+3 = 6,
a(4) = a(3)-4 = 6-4 = 2.
Therefore the first 5 elements of Recaman's sequence will be 0 1 3 6 2.
