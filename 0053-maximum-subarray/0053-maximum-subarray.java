class Solution {
    public int maxSubArray(int[] nums) {
        int max =Integer.MIN_VALUE;
        int Csum=0;
        for(int i=0;i<nums.length;i++){
            Csum=Math.max(nums[i],Csum+nums[i]);
            max=Math.max(Csum,max);
        }
        return max;
    }
}