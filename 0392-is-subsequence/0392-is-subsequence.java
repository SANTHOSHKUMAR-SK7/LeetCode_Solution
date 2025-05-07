class Solution {
    public boolean isSubsequence(String s, String t) {
       int Spointer=0;
       int Tpointer=0;
       while(Spointer<s.length() && Tpointer<t.length()){
        if(s.charAt(Spointer)==t.charAt(Tpointer)){
            Spointer++;
        }
        Tpointer++;
       }
       return Spointer==s.length();
    }
}