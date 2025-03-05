class Solution {
    public int findPeakElement(int[] nums) {
        int j=0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
               int  max=nums[i];
                j=i;
            }
        }
        return j;
    }
}