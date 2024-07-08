class Solution {
    private static final String[] keypad={
        "",     // 0
        "",     // 1
        "abc",  // 2
        "def",  // 3
        "ghi",  // 4
        "jkl",  // 5
        "mno",  // 6
        "pqrs", // 7
        "tuv",  // 8
        "wxyz"  // 9
    };
    public List<String> letterCombinations(String digits) {
        List<String> ans=new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return ans;
        }
        helper(digits,0,new StringBuilder(),ans);
        return ans;
    }
    private void helper(String digits,int index,StringBuilder sb,List<String> ans){
        if(index==digits.length()){
            ans.add(sb.toString());
            return;
        }
        String letters = keypad[digits.charAt(index) - '0'];
        for (char letter : letters.toCharArray()) {
            sb.append(letter);
            helper(digits, index + 1,sb,ans);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}

Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]

Input: digits = ""
Output: []

Input: digits = "2"
Output: ["a","b","c"]
