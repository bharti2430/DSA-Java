//BETTER

HashSet<List<Integer>> st=new HashSet<>();
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            HashSet<Integer> h=new HashSet<>();
            for(int j=i+1;j<n;j++)
            {
                int third=-(arr[i]+arr[j]);
                if(h.contains(third))
                {
                    List<Integer> temp=Arrays.asList(arr[i],arr[j],third);
                    temp.sort(null);
                    st.add(temp);
                }
                h.add(arr[j]);
            }
        }
        List<List<Integer>> ls=new ArrayList<>(st);
        return ls;

//OPTIMAL

List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<n;i++)
        {
            if(i>0 && arr[i]==arr[i-1]) continue;
            int j=i+1;
            int k=n-1;
            while(j<k)
            {
                int sum=arr[i]+arr[j]+arr[k];
                if(sum<0)
                {
                    j++;
                }
                else if(sum>0)
                {
                    k--;
                }
                else
                {
                    List<Integer> temp=Arrays.asList(arr[i],arr[j],arr[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    while(j<k && arr[j]==arr[j-1]) j++;
                    while(j<k && arr[k]==arr[k+1]) k--;
                }
            }
        }
        return ans;
    }


//OUTPUT

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
