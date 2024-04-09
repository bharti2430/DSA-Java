// BRUTE
public static Node reverseDLL(Node head)
    {
        Node temp=head;
        Stack<Integer> st=new Stack<>();
        while(temp!=null)
        {
            st.push(temp.data);
            temp=temp.next;
        }
        temp=head;
        while(temp!=null)
        {
            temp.data=st.pop();
            temp=temp.next;
        }
        return head;
    }

//OPTIMAL
 public static Node reverseDLL(Node head)
    {
        if(head==null || head.next==null) return head;
        Node current=head,last=null;
        while(current!=null)
        {
            last=current.prev;
            current.prev=current.next;
            current.next=last;
            current=current.prev;
        }
        return last.prev;
    }
