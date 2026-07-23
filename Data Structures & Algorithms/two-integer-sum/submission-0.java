class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>map=new HashMap<>();

        map.put(nums[0],0);
        int arr[]=new int[2];

        for(int i=1;i<nums.length;i++){
            int find=target-nums[i];
            if(map.containsKey(find)){
              
                arr[0]=map.get(find);
                  arr[1]=i;
            }
            map.put(nums[i],i);
        }
        return arr;
    }
}
