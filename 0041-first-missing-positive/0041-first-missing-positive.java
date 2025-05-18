class Solution {
    public int firstMissingPositive(int[] nums) {
        // Arrays.sort(nums);
        // int j = 1;
        // int index=0;
        // int[] num=new int[nums.length];
        // num[index++]=nums[0];
        // for(int i=1;i<nums.length;i++){
        //     if(nums[i-1]!=nums[i]){
        //         num[index++]=nums[i];
        //     }
        // }
        // System.out.print(Arrays.toString(num));
        // for(int i=0;i<num.length;i++){
        //     if(num[i]<1){
        //         continue;
        //     }
        //     if(num[i]==j){
        //         j++;
        //     }
        //     else return j;
        // }
        // return j;


        int num=1;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                if(nums[i]==num){
                    num++;
                }
                else if(nums[i]>num){
                    break;
                }
            }
        }
           return num;
    }
}