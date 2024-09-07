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
