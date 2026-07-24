class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb=new StringBuilder();
        
        
        int n=word1.length();
        int m=word2.length();
       

        int min=Math.min(n,m);
        
        for(int i=0;i<min;i++){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));

        }
        while(min<n){
            sb.append(word1.charAt(min));
            min++;
        }
        while(min<m){
            sb.append(word2.charAt(min));
            min++;
        }
        return sb.toString();
    }
}