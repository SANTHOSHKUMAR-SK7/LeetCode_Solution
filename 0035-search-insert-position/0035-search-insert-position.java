class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length -1;
        if(target<=nums[start]){
            return start;
        }
        while(start<=end){
            int mid = start + (end - start)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(target<nums[mid]){
                end=mid-1;
            }
            else if(target>nums[mid]){
                start = mid +1;
            }
        }
        return end+1;
    }
}