//Function to find the length of a loop in the linked list.
    static int countNodesinLoop(Node head)
    {
        HashMap<Node,Integer> map=new HashMap<>();
        int count=0;
        Node temp=head;
        while(temp!=null){
            if(map.containsKey(temp)){
                int value=count-map.get(temp);
                return value;
            }
            map.put(temp,count);
            count++;
            temp=temp.next;
        }
        return 0;
    }

Input:
N = 10
value[]={25,14,19,33,10,21,39,90,58,45}
C = 4
Output: 7
Explanation: The loop is 45->33. So
length of loop is 33->10->21->39->
90->58->45 = 7. 

//optimal
static int countNodesinLoop(Node head)
    {
        Node slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) return findLength(slow,fast);
        }
        return 0;
    }
    private static int findLength(Node slow,Node fast){
        int cnt=1;
        slow=slow.next;
        while(slow!=fast){
            slow=slow.next;
            cnt++;
        }
        return cnt;
    }
