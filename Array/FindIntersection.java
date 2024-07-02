// 2 pointer approach
public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list=new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                list.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        int[] result=new int[list.size()];
        for(int k=0;k<list.size();k++){
            result[k]=list.get(k);
        }
        return result;
    }

// Brute approach
public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list=new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] vis=new int[nums2.length];
        for(int i=0;i<nums1.length;i++){
            for(int j=0;i<nums2.length;j++){
                if((nums1[i]==nums2[j]) && (vis[j]==0)){
                    list.add(nums1[i]);
                    vis[j]=1;
                    break;
                }
                if(nums1[i]<nums2[j]) break;
            }
        }
        int[] result=new int[list.size()];
        for(int k=0;k<list.size();k++){
            result[k]=list.get(k);
        }
        return result;
    }

//BETTER no need to sort the elements
public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);
        }
        for(int i=0;i<nums2.length;i++){
            if(map.containsKey(nums2[i]) && map.get(nums2[i])>0){
                list.add(nums2[i]);
                map.put(nums2[i],map.get(nums2[i])-1);
            }
        }
        int[] result=new int[list.size()];
        for(int k=0;k<list.size();k++){
            result[k]=list.get(k);
        }
        return result;
    }

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
