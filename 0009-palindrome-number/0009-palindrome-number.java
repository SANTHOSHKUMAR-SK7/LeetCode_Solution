class Solution {
    public boolean isPalindrome(int x) {
        int result =0;
        int original=x;
        if(x<0){
            return false;
        }
        while(x!=0){
            int temp = x%10;
            result = temp + (result*10);
            x/=10;
        }
        if(result==original){
            return true;
        }
        else {
            return false;
        }
    }
}