//BRUTE
 public static int[] findMissingRepeatingNumbers(int []a) {
        // Write your code here
        int n=a.length;
        int missing=-1,repeating=-1;
        for(int i=1;i<=n;i++)
        {
            int cnt=0;
            for(int j=0;j<n;j++)
            {
                if(a[j]==i) cnt++;
            }
            if(cnt==2) repeating=i;
           else  if(cnt==0) missing=i;
            if(repeating!=-1 && missing!=-1) break; 
        }
        int[] ans={repeating,missing};
        return ans;
    }

//BETTER

public static int[] findMissingRepeatingNumbers(int []a) {
        // Write your code here
        int n=a.length;
        int missing=-1,repeating=-1;
        int[] hash=new int[n+1];
        for(int i=0;i<n;i++)
        {
            hash[a[i]]++;
        }
        int cnt=0;
        for(int i=1;i<=n;i++)
        {
            if(hash[i]==2) repeating=i;
           else  if(hash[i]==0) missing=i;
            if(repeating!=-1 && missing!=-1) break; 
        }
        int[] ans={repeating,missing};
        return ans;
    }

//OPTIMAL 1

public static int[] findMissingRepeatingNumbers(int []a) {
        long n=a.length;
        long sn1=(n*(n+1)/2);
        long sn2=(n*(n+1)*(2*n+1)/6);
        int missing,repeating;
        long s1=0,s2=0;
        for(int i=0;i<n;i++)
        {
            s1+=(long)a[i];
            s2+=(long)(a[i]*a[i]);
        }
        long val1=s1-sn1;      //x-y
        long val2=s2-sn2;      //x2-y2
        val2=val2/val1;
        repeating=(int)(val1+val2)/2;
        missing=(int)(repeating-val1);
        int[] ans={repeating,missing};
        return ans;
    }

//OPTIMAL 2

Bit Manipulation

//OUTPUT
input:
8
8 4 1 6 7 2 5 8 
output:
8 3
  
