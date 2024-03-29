public static int findDuplicate(ArrayList<Integer> arr, int n)
    {
        // Write your code here. //brute
        int duplicate=arr.get(0);
        for(int i=0;i<arr.size();i++)
        {
            for(int j=i+1;j<arr.size();j++)
            {
                if(arr.get(i)==arr.get(j))
                {
                    duplicate=arr.get(i);
                    break;
                }
            }
        }
        return duplicate;
    }

public static int findDuplicate(ArrayList<Integer> arr, int n)
    {
        // Write your code here. //brute
        int duplicate=arr.get(0);
       Collections.sort(arr);
        for(int i=1;i<arr.size();i++)
        {
           if(arr.get(i)==arr.get(i-1))
           {
               duplicate=arr.get(i);
               break;
           }
        }
        return duplicate;
    }

public static int findDuplicate(ArrayList<Integer> arr, int n)
    {
        // Write your code here. //better
        int duplicate=Integer.MIN_VALUE;
       int freq[]=new int[arr.size()+1];
        for(int i=0;i<arr.size();i++)
        {
           if(freq[arr.get(i)]==0)
           {
              freq[arr.get(i)]++;
           }
           else{
               duplicate=arr.get(i);
               break;
           }
        }
        return duplicate;
    }

//output
Sample Input 1:
1
3
1 1 2
Sample Output 1:
1
