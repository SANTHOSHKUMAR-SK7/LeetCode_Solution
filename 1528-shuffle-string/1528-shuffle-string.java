class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuilder result = new StringBuilder(s); 
        for (int i = 0; i < s.length(); i++) {
            result.setCharAt(indices[i], s.charAt(i));
            }
        return result.toString();
    }
}
