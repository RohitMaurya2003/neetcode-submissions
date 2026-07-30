class Solution {
    public boolean checkInclusion(String s1, String s2) {
       
        int freq[]=new int[26];
        for(char c:s1.toCharArray()){
           freq[c-'a']++;
        }
        
        int n1=s1.length();
        int n2=s2.length();
        if(n2<n1){
            return false;
        }
        int i=0;
        int j=n1;

        while(j<=n2){
            int freq2[]=new int[26];
            for(int v=i;v<j;v++){
                freq2[s2.charAt(v)-'a']++;
            }
            i++;
            j++;
            if(Arrays.equals(freq,freq2)){
                return true;
            }
            Arrays.fill(freq2,0);
        }
        
        
        return false;
    }

}
