class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb=new StringBuilder();
        for(String str:strs){
            int size=str.length();
            
            sb.append(size);
            sb.append('#');
            sb.append(str);
            
        }
        return sb.toString();

    }

    public List<String> decode(String s) {
        List<String>ls=new ArrayList<>();
        int i=0;
        int n=s.length();

        while(i<n){
            int j=i;
            while(s.charAt(j)!='#'){
                j++;
            }
            int size=Integer.parseInt(s.substring(i,j));
            
            ls.add(s.substring(j+1,j+1+size));
            i=j+1+size;
            
        }
        return ls;
    }
}
