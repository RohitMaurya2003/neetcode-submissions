class Solution {
    public boolean isValid(String s) {
        Deque<Character>d=new ArrayDeque<>();

        for(char c:s.toCharArray()){
            if(c=='[' || c=='{'|| c=='('){
                d.push(c);
            }
            else{
                if(d.isEmpty())return false;
                if(d.peek()=='[' && c!=']')return false;
                if(d.peek()=='{' && c!='}')return false;
                if(d.peek()=='(' && c!=')')return false;
                d.pop();
            }
        }
        
        return d.isEmpty();
    }
}
