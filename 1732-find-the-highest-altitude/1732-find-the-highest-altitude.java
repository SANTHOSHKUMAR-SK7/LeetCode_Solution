class Solution {
    public int largestAltitude(int[] gain) {
        int[] altitudeArr=new int[gain.length+1];
        altitudeArr[0]=0;
        int j=1;
        int maxAltitude=altitudeArr[0];
        for(int i=0;i<gain.length;i++){
            altitudeArr[j]=altitudeArr[j-1]+gain[i];
            if(maxAltitude<altitudeArr[j]){
                maxAltitude=altitudeArr[j];
            }
            j++;
        }
        return maxAltitude;
    }       
}