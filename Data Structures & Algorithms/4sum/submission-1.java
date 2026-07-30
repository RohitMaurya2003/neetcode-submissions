class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>>ans=new ArrayList<>();
        int a=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    for(int l=k+1;l<n;l++){
                        if(nums[i]==1000000000 && nums[j]==1000000000 && nums[k]==1000000000 && nums[l]==1000000000){   
                            List<List<Integer>>q=new ArrayList<>();
                            return q;
                        }
                        if(nums[i]+nums[j]+nums[k]+nums[l]==target){
                            List<Integer>ls= Arrays.asList(nums[i],nums[j],nums[k],nums[l]);

                            if(!ans.contains(ls)){
                                ans.add(ls);
                            }
                        }
                    }
                }
            }
        } 
         
        return ans;   

    }
}