//Optimal Majority Element(n/2)
public static int majorityElement(int []v) {
        int n=v.length,count=0,el=v[0];
        for(int i=0;i<n;i++)
        {
            if(count==0)
            {
                count=1;
                el=v[i];
            }
            else if(v[i]==el)
                count++;
            else count--;
        }
        int cnt=0;
        for(int i=0;i<n;i++)
        {
            if(v[i]==el)
                cnt++;
            if(cnt>(n/2))   return el;
        }
        return 0;
    }
