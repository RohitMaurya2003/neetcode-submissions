class Solution {
    public int removeElement(int[] nums, int val) {
       int f=0;
       int l=nums.length-1;
       int count=0;

       while(f<=l){
            
            if(nums[f]==val){
                count++;
                int temp=nums[f];
                nums[f]=nums[l];
                nums[l]=temp;
                l--;
            }
            else{
                f++;
            }
            

       }
       return nums.length-count;
    }
}