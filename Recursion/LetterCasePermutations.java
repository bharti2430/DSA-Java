public List<String> letterCasePermutation(String s) {
        List<String> ans=new ArrayList<>();
        helper(s,0,ans,new StringBuilder());
        return ans;
    }
    private void helper(String s,int index,List<String> ans,StringBuilder output){
        if(index==s.length()){
            ans.add(output.toString());
            return;
        }
        output.append(s.charAt(index));
        helper(s,index+1,ans,output);
        output.deleteCharAt(output.length()-1);
        if(Character.isLetter(s.charAt(index))){
            char change;
            if(Character.isUpperCase(s.charAt(index))){
                change=Character.toLowerCase(s.charAt(index));
            }else{
                change=Character.toUpperCase(s.charAt(index));
            }
            output.append(change);
            helper(s,index+1,ans,output);
            output.deleteCharAt(output.length()-1);
        }
    }

Input: s = "a1b2"
Output: ["a1b2","a1B2","A1b2","A1B2"]

Input: s = "3z4"
Output: ["3z4","3Z4"]
