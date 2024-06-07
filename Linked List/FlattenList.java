Node flatten(Node root)
    {
        ArrayList<Integer> arr=new ArrayList<>();
        Node temp=root;
        while(temp!=null){
            Node t2=temp;
            while(t2!=null){
                arr.add(t2.data);
                t2=t2.bottom;
            }
            temp=temp.next;
        }
        Collections.sort(arr);
        Node newHead=new Node(arr.get(0));
        temp=newHead;
        for(int i=1;i<arr.size();i++){
            Node newNode=new Node(arr.get(i));
            temp.bottom=newNode;
            temp=newNode;
        }
        return newHead;
    }

Input:
5 -> 10 -> 19 -> 28
|     |     |     | 
7     20    22   35
|           |     | 
8          50    40
|                 | 
30               45
Output:  5-> 7-> 8- > 10 -> 19-> 20->
22-> 28-> 30-> 35-> 40-> 45-> 50.

Node flatten(Node root)
    {
        if(root==null || root.next==null) return root;
        Node mergedNode=flatten(root.next);
        return merge(root,mergedNode);
    }
    private Node merge(Node temp1,Node temp2){
        Node t1=temp1,t2=temp2;
        Node dummyNode=new Node(-1);
        Node temp=dummyNode;
        while(t1!=null && t2!=null){
            if(t1.data<t2.data){
                temp.bottom=t1;
                temp=t1;
                t1=t1.bottom;
            }
            else{
                temp.bottom=t2;
                temp=t2;
                t2=t2.bottom;
            }
          temp.next=null;
        }
        if(t1!=null) temp.bottom=t1;
        else temp.bottom=t2;
        return dummyNode.next;
    }
