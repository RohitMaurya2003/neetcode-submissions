class MyHashSet {
    private int bucket=10000;
    private ArrayList<ArrayList<Integer>>buckets;

    public MyHashSet() {
        buckets=new ArrayList<>();
        for(int i=0;i<bucket;i++){
            buckets.add(new ArrayList<>());
        }
    }
    public int hash(int key){
        return key%bucket;
    }
    public void add(int key) {
        ArrayList<Integer>ls=buckets.get(hash(key));
        if(!ls.contains(key)){
            ls.add(key);
        }
    }
    
    public void remove(int key) {
        ArrayList<Integer>ls=buckets.get(hash(key));
        if(ls.contains(key)){
            ls.remove((Integer) key);
        }
    }
    
    public boolean contains(int key) {
        ArrayList<Integer>ls=buckets.get(hash(key));
        return ls.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */