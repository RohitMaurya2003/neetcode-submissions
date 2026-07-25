class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        int pre[]=new int[n];
        int suf[]=new int[n];

        pre[0]=heights[0];
        for(int i=1;i<n;i++){
            pre[i]=Math.max(pre[i-1],heights[i]);
        }
        suf[n-1]=heights[n-1];

        for(int i=n-2;i>=0;i--){
            suf[i]=Math.max(suf[i+1],heights[i]);
        }

        int a=0;
        int b=n-1;
        int max=Integer.MIN_VALUE;

        while(a<b){
            int min=Math.min(pre[a],suf[b]);
            int dis=b-a;
            max=Math.max(min*dis,max);
            if(pre[a]>=suf[b]){
                b--;
            }
            else{
                a++;
            }
            
        }
        return max;
    }
}
