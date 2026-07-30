class Solution {
    public int firstMissingPositive(int[] nums) {
          Set<Integer>set=new HashSet<>();

          for(int i:nums){
            set.add(i);

          }
          int a=1;
          while(set.contains(a)){
            a++;
          }
          return a;
    }
}