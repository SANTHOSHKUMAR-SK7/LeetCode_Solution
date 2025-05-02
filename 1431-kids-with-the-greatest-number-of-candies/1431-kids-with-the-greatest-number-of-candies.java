class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int MaxCandy = 0;
        for (int i=0;i<candies.length;i++) {
            MaxCandy = Math.max(MaxCandy,candies[i]);
        }
        List<Boolean> op = new ArrayList<>();        
        for (int i=0;i<candies.length;i++) {
            if (candies[i] + extraCandies >= MaxCandy) {
                op.add(true);
            } else {
                op.add(false);
            }
        }
        
        return op;
    }
}