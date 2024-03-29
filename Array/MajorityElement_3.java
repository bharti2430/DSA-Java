//BRUTE
public static List< Integer > majorityElement(int []v) {
        List<Integer> ls=new ArrayList<>();
        for(int i=0;i<v.length;i++)
        {
            if(ls.size()==0 || ls.get(0)!=v[i])
            {
                int cnt=0;
                for(int j=0;j<v.length;j++)
                {
                    if(v[i]==v[j]) cnt++;
                }
                 if(cnt>(v.length/3)) ls.add(v[i]);
            }
            if(ls.size()==2) break;
        }
        return ls;
    }

//BETTER
public static List< Integer > majorityElement(int []v) {
        List<Integer> ls=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        int mini=(int)(v.length/3)+1;
        for(int i=0;i<v.length;i++)
        {
            int value=map.getOrDefault(v[i], 0);
            map.put(v[i], value+1);
            if(map.get(v[i])==mini) ls.add(v[i]);
            if(ls.size()==2) break;
        }
        return ls;
    }

//OPTIMAL
public static List< Integer > majorityElement(int []v) {
        List<Integer> ls=new ArrayList<>();
        int mini=(int)(v.length/3)+1;
        int cnt1=0,cnt2=0,el1=Integer.MIN_VALUE,el2=Integer.MIN_VALUE;
        for(int i=0;i<v.length;i++)
        {
            if(cnt1==0 && el2!=v[i])
            {
                cnt1=1;
                el1=v[i];
            }
            else if(cnt2==0 && el1!=v[i])
            {
                cnt2=1;
                el2=v[i];
            }
            else if(el1==v[i]) cnt1++;
            else if(el2==v[i]) cnt2++;
            else{
                cnt1--;
                cnt2--;
            }
        }
        cnt1=0;cnt2=0;
        for(int i=0;i<v.length;i++)
        {
            if(el1==v[i]) cnt1++;
            if(el2==v[i]) cnt2++;
        }
        if(cnt1>=mini) ls.add(el1);
        if(cnt2>=mini) ls.add(el2);
        return ls;
    }


//OUTPUT
Sample Input 1:
6
1 1 1 2 2 2
Sample Output 1:
1 2
