class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        for (int i = len - 1; i >= 0; i--) {
            digits[i] += 1;
            if (digits[i] <= 9) {
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[len + 1];
        result[0] = 1;
        for (int i = 0; i < len; i++) {
            result[i + 1] = digits[i];
        }
        return result;
    }
}