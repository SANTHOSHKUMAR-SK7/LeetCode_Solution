class Solution {
    public int findPeakElement(int[] nums) {
        int index=0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                index=i;
            }
        }
        return index;
    }
}