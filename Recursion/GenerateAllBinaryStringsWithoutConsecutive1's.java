public static List< String > generateString(int N) {
        List<String> ans=new ArrayList<>();
        String str="";
        helper(N,ans,str);
        return ans;
    }
    private static void helper(int n,List<String> ans,String str){
        if(n==0){
            ans.add(str);
            return;
        }
        helper(n-1,ans,str+'0');
        if(str.isEmpty() || str.charAt(str.length()-1)=='0'){
            helper(n-1,ans,str+'1');
        }
    }

Sample Input 1:
4
Sample Output 1:
0000 0001 0010 0100 0101 1000 1001 1010 
