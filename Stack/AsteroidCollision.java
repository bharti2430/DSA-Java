public int[] asteroidCollision(int[] a) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<a.length;i++){
            if(a[i]>0){
                list.add(a[i]);
            }
            else{
                while(!list.isEmpty() && list.get(list.size()-1)>0 && list.get(list.size()-1)<Math.abs(a[i]))
                {
                    list.remove(list.size()-1);
                }
                if(!list.isEmpty() && list.get(list.size()-1)==Math.abs(a[i]))
                {
                    list.remove(list.size()-1);
                    continue;
                }
                else if(list.isEmpty() || list.get(list.size()-1)<0)
                {
                    list.add(a[i]);
                }
            }
        }
        int[] result=new int[list.size()];
        for(int i=0;i<list.size();i++){
            result[i]=list.get(i);
        }
        return result;
    }
