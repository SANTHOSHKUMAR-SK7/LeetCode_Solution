class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        int Asum=0;
        for(int i=0;i<=nums.length;i++){
            sum=sum+i;
        }
        for(int i=0;i<nums.length;i++){
            Asum=Asum+nums[i];
        }
        return sum-Asum;
    }
}