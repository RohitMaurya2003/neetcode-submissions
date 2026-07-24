class Solution {
    public boolean validPalindrome(String s) {
        int count=0;
        int i=0;
        int j=s.length()-1;


        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                boolean a=isPossible(s,i, j-1);
                boolean b=isPossible(s, i+1, j);

                if(a==false && b==false){
                    return false;
                }
                else{
                    break;
                }
                

            }
            i++;
            j--;
        }
        return true;
    }
    boolean isPossible(String s,int i,int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}