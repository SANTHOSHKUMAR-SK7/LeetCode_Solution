class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int total=0;
        for(int i=0;i<stones.length();i++){
            int count=totalcount(stones.charAt(i),jewels);
            total+=count;
        }
        return total;
    }
    int totalcount(char c,String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
                count++;
            }
        }
        return count;
    }
}