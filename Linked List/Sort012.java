// Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head) {
        Node temp=head;
        if(head==null || head.next==null) return head;
        int c0=0,c1=0,c2=0;
        while(temp!=null){
            if(temp.data==0) c0++;
            else if(temp.data==1) c1++;
            else c2++;
            temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            if(c0>0){
                temp.data=0;
                c0--;
            }
            else if(c1>0){
                temp.data=1;
                c1--;
            }
            else{
                temp.data=2;
                c2--;
            }
            temp=temp.next;
        }
        return head;
    }

N = 8
value[] = {1,2,2,1,2,0,2,2}
Output: 0 1 1 2 2 2 2 2

// Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head) {
        if(head==null || head.next==null) return head;
        Node zeroHead,oneHead,twoHead,temp=head;
        zeroHead=new Node(-1);
        oneHead=new Node(-1);
        twoHead=new Node(-1);
        Node zero=zeroHead,one=oneHead,two=twoHead;
        while(temp!=null){
            if(temp.data==0){
                zero.next=temp;
                zero=temp;
            }
            else if(temp.data==1){
                one.next=temp;
                one=temp;
            }
            else{
                two.next=temp;
                two=temp;
            }
            temp=temp.next;
        }
        zero.next=(oneHead.next!=null)?oneHead.next:twoHead.next;
        one.next=twoHead.next;
        two.next=null;
        return zeroHead.next;
    }
