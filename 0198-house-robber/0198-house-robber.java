class Solution {
    public int rob(int[] nums) {
        int money1=0;
        int money2=0;
        int length=nums.length;
        for(int i=0;i<length;i++){
            int temp=Math.max(money1,money2);
            money2=money1+nums[i];
            money1=temp;
        }
        return Math.max(money1,money2);
    }
}