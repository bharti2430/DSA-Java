//brute force
public static List< Integer > sortedArray(int []a, int []b) {
        // Write your code here
        HashSet<Integer> set=new HashSet();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<a.length;i++)
        {
            set.add(a[i]);
        }
        for(int i=0;i<b.length;i++)
        {
            set.add(b[i]);
        }
        for(int i:set)
        {
            list.add(i);
        }
        return list;
    }
public static List< Integer > sortedArray(int []a, int []b) {
        // Write your code here
        ArrayList<Integer> list=new ArrayList<>();
        int i=0,j=0,n1=a.length,n2=b.length;
        while(i<n1 && j<n2)
        {
            if(a[i]<=b[j])
            {
                if(list.size()==0 || list.get(list.size()-1)!=a[i])
                    list.add(a[i]);
                i++;
                
            }
            else
            {
                if(list.size()==0 || list.get(list.size()-1)!=b[j])
                    list.add(b[j]);
                j++;
            }
        }
        while(i<n1)
        {
            if(list.get(list.size()-1)!=a[i])
                    list.add(a[i]);
                i++;
        }
        while(j<n2)
        {
            if(list.get(list.size()-1)!=b[j])
                list.add(b[j]);
            j++;
        }
        return list;
    }

Sample Input 1 :
5 3
1 2 3 4 6
2 3 5
Sample Output 1 :
1 2 3 4 5 6
