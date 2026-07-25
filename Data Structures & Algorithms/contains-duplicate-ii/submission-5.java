class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        
        HashMap<Integer,Integer>map=new HashMap<>();
       
        int n=nums.length;
        if(k==0){
            return false;
        }

        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                int total=Math.abs(map.get(nums[i])-i);
                if(total<=k){
                    return true;
                }
            }
            map.put(nums[i],i);
            
        }
        return false;
    }
}