class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] shuffleArr=new int[nums.length];
        int j=0;
        for(int i=0;i<(nums.length)/2;i++){
            shuffleArr[j]=nums[i];
            j=j+2;
        }
        int k=1;
        for(int i=(nums.length)/2;i<nums.length;i++){
            shuffleArr[k]=nums[i];
            k=k+2;
        }
        return shuffleArr;
    }
}