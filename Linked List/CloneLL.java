public Node copyRandomList(Node head) {
        HashMap<Node,Node> map=new HashMap<>();
        Node temp=head;
        while(temp!=null){
            Node newNode=new Node(temp.val);
            map.put(temp,newNode);
            temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            Node copyNode =map.get(temp);
            copyNode.next=map.get(temp.next);
            copyNode.random=map.get(temp.random);
            temp=temp.next;
        }
        return map.get(head);
    }

Input: head = [[7,null],[13,0],[11,4],[10,2],[1,0]]
Output: [[7,null],[13,0],[11,4],[10,2],[1,0]]

public Node copyRandomList(Node head) {
       Node temp=head,copyNode;
        while(temp!=null){
            copyNode=new Node(temp.val);
            copyNode.next=temp.next;
            temp.next=copyNode;
            temp=temp.next.next;
        }
        temp=head;
        while(temp!=null){
            copyNode=temp.next;
            if(temp.random!=null) copyNode.random=temp.random.next;
            temp=temp.next.next;
        }
        Node dummyNode=new Node(-1);
        Node res=dummyNode;
        temp=head;
        while(temp!=null){
            res.next=temp.next;
            temp.next=temp.next.next;
            res=res.next;
            temp=temp.next;
        }
        return dummyNode.next;
    }
