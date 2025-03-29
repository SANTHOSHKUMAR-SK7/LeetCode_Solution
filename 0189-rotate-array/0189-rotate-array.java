class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, nums.length - k, nums.length - 1); 
        reverse(nums, 0, nums.length - 1 - k); 
        reverse(nums, 0, nums.length - 1);
    }

    public void reverse(int arr[], int k, int index) {
        while (k < index) {
            int swap = arr[k];
            arr[k] = arr[index];
            arr[index] = swap;
            k++;
            index--;
        }
    }
}