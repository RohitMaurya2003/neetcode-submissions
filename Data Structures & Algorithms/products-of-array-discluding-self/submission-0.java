class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int count=0;
        int max=1;

        for(int i:nums){
            if(i==0){
                count++;
            }
            else{
                max*=i;
            }
        }
        int ans[]=new int[n];
        
        if(count==1){
            for(int i=0;i<n;i++){
                if(nums[i]==0){
                    ans[i]=max;
                }
            }
        }
        else if(count>1){
            return ans;
        }
        else{
        

        int indx=0;
        for(int i:nums){ 

            ans[indx++]=max/i;
        }
        }
        return ans;
    }
}  
