//BETTER
int count=0;
        for(int i=0;i<A.length;i++)
        {
            int xor=0;
            for(int j=i;j<A.length;j++)
            {
                xor=xor^A[j];
                if(xor==B)
                    count++;
            }
        }
        return count;

//OPTIMAL
HashMap<Integer,Integer> map=new HashMap<>();
        int cnt=0,xor=0;
        map.put(xor,1);
        for(int i=0;i<a.length;i++)
        {
           xor=xor^a[i];
           int x=xor^b;
           if(map.containsKey(x))
           {
               cnt+=map.get(x);
           }
           if(map.containsKey(xor))
           {
               map.put(xor,map.get(xor)+1);
           }
           else{
               map.put(xor,1);
           }
        }
        return cnt;


//OUTPUT
Input: ‘N’ = 4 ‘B’ = 2
‘A’ = [1, 2, 3, 2]

Output: 3
