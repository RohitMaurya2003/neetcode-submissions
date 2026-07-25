class Solution {
    public int subarraySum(int[] nums, int k) {
        
        int n=nums.length;
        int count=0;
        int curr=0;
       
        HashMap<Integer,Integer>map=new HashMap<>();
         map.put(0,1);
        for(int i:nums){
            curr+=i;
            int diff=curr-k;
            count+=map.getOrDefault(diff,0);
            map.put(curr,map.getOrDefault(curr,0)+1);
        }
        return count;
    }
}