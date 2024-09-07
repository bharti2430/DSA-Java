// Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a, String b) {
        if(a.length()!=b.length()) return false;
        HashMap<Character,Integer> freqA=new HashMap<>();
        HashMap<Character,Integer> freqB=new HashMap<>();
        for(char c:a.toCharArray()){
            if(Character.isLetter(c)){
                freqA.put(c,freqA.getOrDefault(c,0)+1);
            }
        }
        for(char c:b.toCharArray()){
            if(Character.isLetter(c)){
                freqB.put(c,freqB.getOrDefault(c,0)+1);
            }
        }
        if(freqA.equals(freqB)){
            return true;
        }
        else return false;
    }

Input:a = geeksforgeeks, b = forgeeksgeeks
Output: YES
Explanation: Both the string have same characters with
        same frequency. So, both are anagrams.

// 2
public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length())
            return false;
        int[] alphabet = new int[26];
        for (int i = 0; i < s.length(); i++) 
            alphabet[s.charAt(i) - 'a']++;
        for (int i = 0; i < t.length(); i++) 
            alphabet[t.charAt(i) - 'a']--;
        for (int i : alphabet) 
            if (i != 0) 
                return false;
        return true;
    }

