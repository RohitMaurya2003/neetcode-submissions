class Node{
    int val;
    int freq;

    Node(int val,int freq){
        this.val=val;
        this.freq=freq;
    }
}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);

        }

        ArrayList<Node>ls=new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            ls.add(new Node(entry.getKey(),entry.getValue()));
        }
        ls.sort((a,b)->Integer.compare(b.freq,a.freq));
        int ans[]=new int[k];

        for(int i=0;i<k;i++){
            ans[i]=ls.get(i).val;
        }
        return ans;
    }


}
