class Solution {
    public int kthFactor(int n, int k) {
        int Kfactor=1;
        if(k==1){
            return 1;
        }
        for(int i=2;i<=n;i++){
            if(n%i==0){
                Kfactor++;
            }
            if(Kfactor==k){
                return i;
            }
        }
        return -1;
    }
}