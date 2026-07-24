class ListNode{
    int key,val;
    ListNode next;

    ListNode(int key,int val,ListNode next){
        this.key=key;
        this.val=val;
        this.next=next;
    }

    ListNode(){
        this.key=-1;
        this.val=-1;
        this.next=null;
    }
}
class MyHashMap {
    private int keys=10000;
    ListNode node[];
    public MyHashMap() {
        node=new ListNode[10000];
        for(int i=0;i<keys;i++){
            node[i]=new ListNode();
        }
    }
    public int hash(int key){
        return key%keys;
    } 
    
    public void put(int key, int value) {
        ListNode curr=node[hash(key)];
        while(curr.next!=null){
            if(curr.next.key==key ){
                curr.next.val=value;
                     return;
                
            
            }
            curr=curr.next;
        }
        curr.next=new ListNode(key,value,null);
    }
    
    public int get(int key) {
         ListNode curr=node[hash(key)];
        while(curr!=null){
            if(curr.key==key){
                return curr.val;
            }
            curr=curr.next;
        }
        return -1;
    }
    
    public void remove(int key) {
        ListNode curr=node[hash(key)];
        while(curr.next!=null){
            if(curr.next.key==key){
                curr.next=curr.next.next;
                return;
            }
            curr=curr.next;
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */