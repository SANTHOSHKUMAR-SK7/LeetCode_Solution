class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int min=nums[0];
        int max=nums[nums.length-1];
        int Min=min;
        while(min>=2){
            if(min%Min==0 && max%Min==0){
                return Min;
                }
            Min--;
        }
        return Min;
    }
}