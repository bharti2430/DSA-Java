class Node{
    int key,value,frequency;
    Node next,prev;
    Node(int key,int value){
        this.key=key;
        this.value=value;
        this.frequency=1;
    }
}
class DLL{
    int listSize;
    Node head,tail;
    DLL(){
        this.listSize=0;
        this.head=new Node(0,0);
        this.tail=new Node(0,0);
        head.next=tail;
        tail.prev=head;
    }
    public void addNode(Node current){
        Node nextNode=head.next;
        current.prev=head;
        current.next=nextNode;
        head.next=current;
        nextNode.prev=current;
        listSize++;
    }
    public void removeNode(Node current){
        Node prevNode=current.prev;
        Node nextNode=current.next;
        if(prevNode!=null) prevNode.next=nextNode;
        if(nextNode!=null) nextNode.prev=prevNode;
        listSize--;
    }

} 
class LFUCache {
    HashMap<Integer,DLL> freqMap=new HashMap<>();
    HashMap<Integer,Node> keyMap=new HashMap<>();
    final int capacity;
    int currSize,minFreq;
    public LFUCache(int capacity) {
        this.capacity=capacity;
        this.currSize=0;
        this.minFreq=0;
    }    
    public int get(int key) {
        Node node=keyMap.get(key);
        if(node==null){
            return -1;
        }
        updateNode(node);
        return node.value;
    }
    
    public void put(int key, int value) {
        if(capacity==0){
            return;
        }
        if(keyMap.containsKey(key)){
            Node node=keyMap.get(key);
            node.value=value;
            updateNode(node);
        }
        else{
            currSize++;
            if(currSize>capacity){
                DLL minFreqList=freqMap.get(minFreq);
                keyMap.remove(minFreqList.tail.prev.key);
                minFreqList.removeNode(minFreqList.tail.prev);
                currSize--;
            }
            minFreq=1;
            Node newnode=new Node(key,value);
            DLL curList=freqMap.getOrDefault(1,new DLL());
            curList.addNode(newnode);
            freqMap.put(1,curList);
            keyMap.put(key,newnode);
        }
    }
    public void updateNode(Node current){
        int currFreq=current.frequency;
        DLL curList=freqMap.get(currFreq);
        curList.removeNode(current);
        if(currFreq==minFreq && curList.listSize==0){
            minFreq++;
        }
        current.frequency++;
        DLL newList=freqMap.getOrDefault(current.frequency,new DLL());
        newList.addNode(current);
        freqMap.put(current.frequency,newList);
    }
}

Input
["LFUCache", "put", "put", "get", "put", "get", "get", "put", "get", "get", "get"]
[[2], [1, 1], [2, 2], [1], [3, 3], [2], [3], [4, 4], [1], [3], [4]]
Output
[null, null, null, 1, null, -1, 3, null, -1, 3, 4]

Explanation
// cnt(x) = the use counter for key x
// cache=[] will show the last used order for tiebreakers (leftmost element is  most recent)
LFUCache lfu = new LFUCache(2);
lfu.put(1, 1);   // cache=[1,_], cnt(1)=1
lfu.put(2, 2);   // cache=[2,1], cnt(2)=1, cnt(1)=1
lfu.get(1);      // return 1
                 // cache=[1,2], cnt(2)=1, cnt(1)=2
lfu.put(3, 3);   // 2 is the LFU key because cnt(2)=1 is the smallest, invalidate 2.
                 // cache=[3,1], cnt(3)=1, cnt(1)=2
lfu.get(2);      // return -1 (not found)
lfu.get(3);      // return 3
                 // cache=[3,1], cnt(3)=2, cnt(1)=2
lfu.put(4, 4);   // Both 1 and 3 have the same cnt, but 1 is LRU, invalidate 1.
                 // cache=[4,3], cnt(4)=1, cnt(3)=2
lfu.get(1);      // return -1 (not found)
lfu.get(3);      // return 3
                 // cache=[3,4], cnt(4)=1, cnt(3)=3
lfu.get(4);      // return 4
                 // cache=[4,3], cnt(4)=2, cnt(3)=3
