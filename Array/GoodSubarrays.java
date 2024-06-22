// Good subarrays are those which contains b distinct elements
public static int goodSubarrays(int arr[], int n,int b) {
        int count=0;
        for(int i=0;i<n;i++){
            HashSet<Integer> st=new HashSet<>();
            for(int j=i;j<n;j++){
                for(int k=i;k<=j;k++){
                    st.add(arr[k]);
                }
                if(st.size()==b) count++;
            }
        }
        return count;
    }

//better
public static int goodSubarrays(int arr[], int n,int b) {
        int count=0;
        for(int i=0;i<n;i++){
            HashMap<Integer,Integer> map=new HashMap<>();
            for(int j=i;j<n;j++){
                map.put(arr[j],map.getOrDefault(arr[j],0)+1);
                if(map.size()==b) count++;
                if(map.size()>b) break;
            }
        }
        return count;
    }

Sample Input 1 :
2
5 2 
1 2 1 2 3
5 3
1 2 1 3 4
Sample Output 1:
7
3
Explanation for Sample 1:
All good subarrays in test case 1 are [1, 2], [2, 1], [1, 2], [2, 3], [1, 2, 1], [2, 1, 2], [1, 2, 1, 2].

All good subarrays in test case 2 are [1, 2, 1, 3], [2, 1, 3], [1, 3, 4]. So the total good subarray are 3.
