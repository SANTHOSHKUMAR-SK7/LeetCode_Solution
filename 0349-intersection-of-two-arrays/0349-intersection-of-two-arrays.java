class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> Set = new HashSet<>();
        Set<Integer> Set1 = new HashSet<>();
        for (int  i : nums1) {
            Set.add(i);
        }
        int x1=0;
        for(int x:nums2){
            if (Set.contains(x)) {
                Set1.add(x);
            }
        }
        int [] inter=new int[Set1.size()];
        for (int dd : Set1) {
           inter[x1++]=dd;
        }
        return inter;
    }
}