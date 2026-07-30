class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(char c:s1.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        
        int n1=s1.length();
        int n2=s2.length();
        if(n2<n1){
            return false;
        }
        
        int i=0;
        int j=n1-1;

        while(j<n2){
            int p1=0;
            HashMap<Character,Integer>map2=new HashMap<>();
            int a=i;
            while(a<=j){
                map2.put(s2.charAt(a),map2.getOrDefault(s2.charAt(a),0)+1);
                a++;
            }
            if(map.equals(map2)){
                return true;
            }
            j++;
            i++;
        }
        return false;
    }

}
