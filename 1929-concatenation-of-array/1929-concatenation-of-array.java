class Solution {
    public int[] getConcatenation(int[] nums) {
        int len=nums.length;
        int[] newArr=new int[2*len];
        for(int i=0;i<len;i++){
            newArr[i]=nums[i];
        }
        int j=0;
        for(int i=len;i<newArr.length;i++){
            newArr[i]=nums[j];
            j++;
        }
        return newArr;
    }
}