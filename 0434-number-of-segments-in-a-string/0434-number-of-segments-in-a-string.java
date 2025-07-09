class Solution {
    public int countSegments(String s) {
        int i=s.length();
        int count=0;
        if(i==0){
            return count;
        }
        String[] seg=s.split(" ");
        for(int j=0;j<seg.length;j++){
            if(!seg[j].isEmpty()){
                count++;
            }
        }
        return count;
    }
}