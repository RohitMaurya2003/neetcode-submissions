class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>>map=new HashMap<>();
        List<List<String>>ans=new ArrayList<>();

        for(String str:strs){
            char ch[]=str.toCharArray();
            Arrays.sort(ch);
            String s=new String(ch);
            map.computeIfAbsent(s,k-> new ArrayList<>()).add(str);
        }

        for(List<String> ls:map.values()){
            ans.add(ls);
        }

        return ans;
    }
}
