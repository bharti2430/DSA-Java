//brute
public static int majorityElement(int []v) {
        // Write your code here
        int n=v.length;
        for(int i=0;i<n;i++)
        {
            int cnt=0;
            for(int j=0;j<n;j++)
            {
                if(v[j]==v[i])
                    cnt++;
            }
            if(cnt>(n/2)) return v[i];
        }
        return 0;
    }

//better
 public static int majorityElement(int []v) {
        int n=v.length;
        HashMap<Integer,Integer> count=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int value=count.getOrDefault(v[i], 0);
            count.put(v[i], value+1);
        }
        for(Map.Entry<Integer,Integer> it:count.entrySet())
        {
            if(it.getValue()>n/2)
            {
                int k=it.getKey();
                return k;
            }
        }
        return -1;
    }
