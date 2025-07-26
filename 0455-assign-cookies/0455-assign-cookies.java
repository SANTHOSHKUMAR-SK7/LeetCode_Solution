class Solution {
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        boolean[] give = new boolean[s.length]; 
        int childCount = 0;
        for (int i = 0; i < g.length; i++) {
            for (int j = 0; j < s.length; j++) {
                if (!give[j] && s[j] >= g[i]) {
                    give[j] = true; 
                    childCount++;
                    break;
                }
            }
        }
        return childCount;
    }
}