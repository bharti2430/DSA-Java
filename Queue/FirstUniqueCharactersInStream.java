public String FirstNonRepeating(String A)
    {
        HashMap<Character,Integer> map=new HashMap<>();
        Queue<Character> q=new LinkedList<>();
        StringBuilder result=new StringBuilder();
        for(int i=0;i<A.length();i++){
            char ch=A.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            q.offer(ch);
            while(!q.isEmpty()){
                if(map.get(q.peek())>1){
                    q.poll();
                }
                else{
                    result.append(q.peek());
                    break;
                }
            }
            if(q.isEmpty()){
                result.append('#');
            }
        }
        return result.toString();
    }

Input: A = "aabc"
Output: "a#bb"
Input: A = "zz"
Output: "z#"
