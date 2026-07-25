class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int a=0;
        int b=numbers.length-1;
        int arr[]=new int[2];

        while(a<=b){
            int sum=numbers[a]+numbers[b];
            if(sum==target){
                arr[0]=a+1;
                arr[1]=b+1;
                return arr;
            }
            if(sum>target){
                b--;
            }
            else{
                a++;
            }
        }
        return arr;
    }
}
