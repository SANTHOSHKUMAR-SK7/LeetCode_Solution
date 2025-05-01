class Solution {
    public int[] buildArray(int[] nums) {
        int len=nums.length;
        int[] temp=new int[len];
        for(int i=0;i<len;i++){
            temp[i]=nums[nums[i]];
        }
        return temp;
    }
}