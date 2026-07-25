class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ls = new ArrayList<>();

        Arrays.sort(nums);
        int i = 0;
        int n = nums.length - 1;
        int count = 0;
        while (i <=n) {
            if (i != 0) {
                while (i < n && nums[i] == nums[i - 1]) {
                    i++;
                }
            }
            int j = i + 1;
            int k = n;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    List<Integer> ans = new ArrayList<>();
                    ans.add(nums[i]);
                    ans.add(nums[j]);
                    ans.add(nums[k]);
                    ls.add(ans);
                    j++;
                    k--;
                } else if (sum > 0) {
                    k--;

                } else {
                    j++;
                }
                if (sum > 0)
                    while (j < k && nums[k] == nums[k+1]) {
                        k--;
                    }

                else
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }
            }
            i++;
        }
        return ls;
    }
}
