public boolean isPalindrome(ListNode head) {
        ListNode temp=head;
        Stack<Integer> st=new Stack<>();
        while(temp!=null){
            st.push(temp.val);
            temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            int t=st.pop();
            if(temp.val!=t) return false;
            temp=temp.next;
        }
        return true;
    }

Input: head = [1,2,2,1]
Output: true

//OPTIMAL
