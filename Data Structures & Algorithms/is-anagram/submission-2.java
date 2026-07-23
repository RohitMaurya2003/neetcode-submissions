class Solution {
    public boolean isAnagram(String s, String t) {
        char ch[]=s.toCharArray();
        char ch2[]=t.toCharArray();

        Arrays.sort(ch);
        Arrays.sort(ch2);

        String s1=new String(ch);
        String s2=new String(ch2);

        if(s1.equals(s2)){
            return true;
        }
        return false;
    }
}
