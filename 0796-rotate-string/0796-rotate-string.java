class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }
        String both=s+s;
        return both.contains(goal);

    }
}