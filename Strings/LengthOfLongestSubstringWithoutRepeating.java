// Given a string s, find the length of the longest substring without repeating characters.

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeating {

    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> charIndex = new HashMap<>();
        int start = 0;
        int maxLength = 0;

        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);

            if (charIndex.containsKey(currentChar) && charIndex.get(currentChar) >= start) {
                start = charIndex.get(currentChar) + 1;
            }

            charIndex.put(currentChar, end);
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));  // Output: 3
    }
}

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
