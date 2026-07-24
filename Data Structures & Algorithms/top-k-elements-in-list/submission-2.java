class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);

        }
        ArrayList<ArrayList<Integer>>ls=new ArrayList<>();
        for(int i=0;i<nums.length+1;i++){
            ls.add(new ArrayList<>());
        }

        for(int i:map.keySet()){
            ls.get(map.get(i)).add(i);
        }


        int indx=0;
        int ans[]=new int[k];
        for(int i=nums.length;i>0;i--){
            if(ls.get(i).size()>0){
                for(int j:ls.get(i)){
                    ans[indx++]=j;
                    if(indx==k){
                        return ans;
                    }
                }
                
            }
        }
        return ans;



    }
}

