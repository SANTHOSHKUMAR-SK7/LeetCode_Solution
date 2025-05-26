class Solution {
    public int[] applyOperations(int[] nums) {
        operation(nums);
        return nums;
    }
    public int[] operation(int[] nums){
        int len=nums.length;
        for(int i=1;i<len;i++){
            if(nums[i]==nums[i-1]){
                nums[i-1]=nums[i-1]*2;
                nums[i]=0;
            }
        }
        moveZero(nums);
        return nums;
    }
    public int[] moveZero(int[] nums){
        int len=nums.length;
        int Move=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[Move];
                nums[Move] = temp;
                Move++;
            }
        } 
        return nums;       
    }
}