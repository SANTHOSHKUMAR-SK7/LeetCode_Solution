class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] nope={-1,-1};
        int stp=0;
        int endp=0;
        if(nums.length==0){
            return nope;
        }
        int right=nums.length-1;
        int left=0;
        while(left<nums.length){
            if(nums[left]==target){
                stp=left;
                break;
            }
            else stp=-1;
            left++;
        }
        while(right>=0){
            if(nums[right]==target){
                endp=right;
                break;
            }
            else endp=-1;
            right--;
        }
        int[] position={stp,endp};
        return position;
        
    }
}