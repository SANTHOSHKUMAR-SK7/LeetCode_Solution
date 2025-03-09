class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);        
        int maxCount = 1, count = 1, maxNum = nums[0];        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                if (count > maxCount) {
                    maxCount = count;
                    maxNum = nums[i - 1];
                }
                count = 1;
            }
        }
        if (count > maxCount) {
            maxCount = count;
            maxNum = nums[nums.length - 1];
        }
            return maxNum;
    }
}