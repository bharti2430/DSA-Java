//Optimal
public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1=headA,temp2=headB;
        while(temp1!=temp2){
            temp1=temp1==null?headB:temp1.next;
            temp2=temp2==null?headA:temp2.next;
        }
        return temp1;
    }

//output
Input: intersectVal = 2, listA = [1,9,1,2,4], listB = [3,2,4], skipA = 3, skipB = 1
Output: Intersected at '2'

//hashing
  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1=headA,temp2=headB;
        HashSet<ListNode> st=new HashSet<>();
        while(temp1!=null){
            st.add(temp1);
            temp1=temp1.next;
        }
        while(temp2!=null){
            if(st.contains(temp2)) return temp2;
            temp2=temp2.next;
        }
        return null;
    }

//Difference in length
    ListNode temp1=headA,temp2=headB;
        int n1=0,n2=0;
        while(temp1!=null){
            n1++;
            temp1=temp1.next;
        }
        while(temp2!=null){
            n2++;
            temp2=temp2.next;
        }
        return collisionPoint(headA,headB,(n2-n1));
        
    }
    public ListNode collisionPoint(ListNode temp1,ListNode temp2,int d){
        if(d>0){
            while(d!=0){
                d--;
                temp2=temp2.next;
            }
        }
        else{
            while(d!=0){
                d++;
                temp1=temp1.next;
            }
        }
        while(temp1!=temp2){
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return temp1;
    }
