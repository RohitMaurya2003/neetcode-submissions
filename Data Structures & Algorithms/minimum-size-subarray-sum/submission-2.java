class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = 0;
        int min = n + 1;
        int sum = 0;
        while (j < n) {
            while (j < n && sum < target) {
                sum += nums[j];
                j++;
            }
            
          
            while (sum >= target) {
                 min = Math.min(min, j - i );
                sum = sum - nums[i];
                i++;
            }

           
            
            
        }
        while(j==n && sum>=target){
             min = Math.min(min, j - i );
                sum = sum - nums[i];
                i++;
        }
       
        return min == n + 1 ? 0 : min;
    }
}