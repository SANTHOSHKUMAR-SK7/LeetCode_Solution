class Solution {
    public boolean isPalindrome(String s) {
        String str = "";
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {   
                str += c;
            }
        }
        String rev = "";
        int m = str.length();
        for(int i=m-1;i>=0;i--){
            char c = str.charAt(i);
            rev += c;
        }
        if(str.equals(rev)) {
            return true;
        }
        return false;
    }
}