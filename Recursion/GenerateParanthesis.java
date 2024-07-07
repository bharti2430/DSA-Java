public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        Helper(list,"",0,0,n);
        return list;
    }
    private static void Helper(List<String> result, String current, int open, int close, int max) {
        if(current.length()==2*max){
            result.add(current);
            return;
        }
        if(open<max){
            Helper(result,current+"(",open+1,close,max);
        }
        if(close<open){
            Helper(result,current+")",open,close+1,max);
        }
    }

Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]
if n=1 then output is [ "()" ]
