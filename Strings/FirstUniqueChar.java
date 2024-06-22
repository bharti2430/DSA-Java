public int firstUniqChar(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(map.get(ch)==1){
                return i;
            }
        }
        return -1;
    }

Input: s = "leetcode"
Output: 0

Input: s = "loveleetcode"
Output: 2

// single pass
public int firstUniqChar(String s) {
  if (s == null || s.isEmpty())
  {
      return -1;
  }
  HashMap<Character,Integer> map=new HashMap<>();
  Queue<Integer> q=new LinkedList<>();
  for(int i=0;i<s.length();i++){
      char ch=s.charAt(i);
      map.put(ch,map.getOrDefault(ch,0)+1);
      q.add(i);
      while (!q.isEmpty() && map.get(s.charAt(q.peek())) > 1) {
          q.poll();
      }
  }
  return q.isEmpty() ? -1 : q.peek();
}
