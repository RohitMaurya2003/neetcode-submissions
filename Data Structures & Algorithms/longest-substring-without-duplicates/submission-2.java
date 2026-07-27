class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        HashMap<Character,Integer>map=new HashMap<>();
        if(n==0){
            return 0;
        }

        int i=0;
        int j=0;
        int max=Integer.MIN_VALUE;

        while(j<n){
            char ch=s.charAt(j);
            if(!map.containsKey(ch)){
                map.put(ch,map.getOrDefault(ch,0)+1);

               
            }
            else{
                while(map.containsKey(ch)){
                    char c=s.charAt(i);
                    map.remove(c);
                    i++;
                }
                map.put(ch,map.getOrDefault(ch,0)+1);
               
            }
            max=Math.max(max,j-i+1);
            j++;
        }
        return max;
    }
}
