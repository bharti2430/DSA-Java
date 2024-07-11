public String getPermutation(int n, int k) {
        String output="";
        ArrayList<Integer> numbers=new ArrayList<>();
        int fact=1;
        for(int i=1;i<n;i++){
            fact*=i;
            numbers.add(i);
        }
        numbers.add(n);
        k=k-1;
        while(true){
            output=output+numbers.get(k/fact);
            numbers.remove(k/fact);
            if(numbers.size()==0){
                break;
            }
            k=k%fact;
            fact=fact/numbers.size();
        }
        return output;
    }

Input: n = 3, k = 3
Output: "213"

Input: n = 4, k = 9
Output: "2314"
