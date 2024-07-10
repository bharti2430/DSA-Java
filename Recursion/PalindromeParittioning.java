public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        helper(s,0,new ArrayList<>(),ans);
        return ans;
    }
    private void helper(String s,int index,List<String> list,List<List<String>> ans){
        if(index==s.length()){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=index;i<s.length();i++){
            if(isPalindrome(s,index,i)){
                list.add(s.substring(index,i+1));
                helper(s,i+1,list,ans);
                list.remove(list.size()-1);
            }
        }
    }
    private boolean isPalindrome(String s,int start,int end){
        while(start<=end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

Input: s = "aab"
Output: [["a","a","b"],["aa","b"]]
