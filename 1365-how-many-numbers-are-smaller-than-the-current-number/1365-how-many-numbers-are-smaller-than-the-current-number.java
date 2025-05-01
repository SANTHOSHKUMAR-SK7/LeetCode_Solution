class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int len=nums.length;
        int[] countArr=new int[len];
        for(int i=0;i<len;i++){
            countArr[i]=Count(nums[i],nums);
        }
        return countArr;
    }
    public int Count(int nbr,int[] nums){
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<nbr){
                count++;
            }
        }
        return count;
    }
}