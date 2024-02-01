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

Sample Input 1 :
5 3
1 2 3 4 6
2 3 5
Sample Output 1 :
1 2 3 4 5 6
