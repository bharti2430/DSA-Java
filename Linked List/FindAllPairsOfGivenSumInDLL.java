public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        Node t1=head;
        while(t1!=null){
            Node t2=t1.next;
            while(t2!=null && (t1.data+t2.data)<=target){
                if((t1.data+t2.data)==target){
                    result.add(new ArrayList<>(Arrays.asList(t1.data, t2.data)));
                }
                t2=t2.next;
            }
            t1=t1.next; 
        }
        return result;
    }

Input:  
1 <-> 2 <-> 4 <-> 5 <-> 6 <-> 8 <-> 9
target = 7
Output: (1, 6), (2,5)

//Optimal
private static Node findTail(Node t){
        Node temp=t;
        while(temp.next!=null){
            temp=temp.next;
        }
        return temp;
    }
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        Node left=head,right=findTail(head);
        while(left.data<right.data){
            if((left.data+right.data)==target){
                result.add(new ArrayList<>(Arrays.asList(left.data,right.data)));
                left=left.next;
                right=right.prev;
            }
            else if((left.data+right.data)>target)
            {
                right=right.prev;
            }
            else left=left.next;
        }
        return result;
    }
