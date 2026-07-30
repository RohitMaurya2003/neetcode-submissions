class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int freq[] = new int[26];
        for (char c : s1.toCharArray()) {
            freq[c - 'a']++;
        }

        int n1 = s1.length();
        int n2 = s2.length();
        if (n2 < n1) {
            return false;
        }
        
      
        int freq2[] = new int[26];
        for (int v = 0; v < n1; v++) {
            freq2[s2.charAt(v) - 'a']++;
        }
        int j=n1;

        int i=0;
         if (Arrays.equals(freq, freq2)) {
                return true;
            }
        while (j < n2) {
            
            freq2[s2.charAt(i)-'a']--;
            freq2[s2.charAt(j)-'a']++;

         if (Arrays.equals(freq, freq2)) {
                return true;
            }
           
            i++;
            j++;
             
            
        }

        return false;
    }
}
