class Solution {
    public int subtractProductAndSum(int n) {
        int prod=1;
        int sum=0;
        int temp=n;
        while(temp>0){
            int temp1=temp%10;
            prod=prod*temp1;
            sum=sum+temp1;
            temp=temp/10;
        }
        return prod-sum;
    }
}