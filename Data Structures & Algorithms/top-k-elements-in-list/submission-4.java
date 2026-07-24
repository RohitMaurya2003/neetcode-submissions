class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);

        }
        ArrayList<Integer>ls[]=new ArrayList[nums.length+1];
        for(int i=0;i<nums.length+1;i++){
           ls[i]=new ArrayList<>();
        }

        for(int i:map.keySet()){
            int freq=map.get(i);
            // if(ls[freq].length==0) ls[freq]=new ArrayList<>();
            ls[freq].add(i);
            
        }


        int indx=0;
        int ans[]=new int[k];
        for(int i=nums.length;i>0;i--){
            if(ls[i]!=null){
                for(int j:ls[i]){
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

