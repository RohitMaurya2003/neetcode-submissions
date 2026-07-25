class Solution {
    public int removeDuplicates(int[] nums) {
        int indx=1;
        int n=nums.length;
        for(int i=1;i<n;i++){
            if(nums[i]!=nums[i-1]){
                nums[indx++]=nums[i];
            }
        }
        return indx;
    }
}