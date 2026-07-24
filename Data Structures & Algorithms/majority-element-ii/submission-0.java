class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        int t=nums.length/3;
        List<Integer>ls=new ArrayList<>();
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            int val=entry.getValue();
            if(val>t){
                ls.add(entry.getKey());
            }

        }
        return ls;
    }
}