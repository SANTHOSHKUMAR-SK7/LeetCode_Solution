class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] TargetArr=new int[nums.length];
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            list.add(index[i],nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            TargetArr[i]=list.get(i);
        }
        return TargetArr;
    }
}