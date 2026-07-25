class Solution {
    public void quickSort(int arr[],int i,int j){
        if(i<j){
            int pivot=partion(arr,i,j);
            quickSort(arr,i,pivot-1);
            quickSort(arr,pivot+1,j);
        }
    }
    public int partion(int arr[],int i,int j){
        int pivot=arr[j];
        int low=i-1;

        for(int l=i;l<j;l++){
            if(arr[l]<=pivot){
                low++;
                swap(arr,low,l);
            }
        }
        swap(arr,low+1,j);
        return low+1;

    }
    public void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public int[] sortArray(int[] nums) {
        quickSort(nums,0,nums.length-1);
        return nums;
    }
}