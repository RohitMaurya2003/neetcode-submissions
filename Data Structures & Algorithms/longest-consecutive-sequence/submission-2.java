class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return 1;
        }
        HashSet<Integer>set=new HashSet<>();
        int max=Integer.MIN_VALUE;
        for(int i:nums){
            set.add(i);
        }

        ArrayList<Integer>start=new ArrayList<>();
        for(int i:nums){
            if(!set.contains(i-1)){
                start.add(i);
            }
        }
        
        for(int i:start){
            int count=0;
            int a=i;
            while(true){
                if(set.contains(a++)){
                    count++;
                    max=Math.max(count,max);
                }
                else{
                    break;
                }
            }
        }
        return max;
        
    }
}
