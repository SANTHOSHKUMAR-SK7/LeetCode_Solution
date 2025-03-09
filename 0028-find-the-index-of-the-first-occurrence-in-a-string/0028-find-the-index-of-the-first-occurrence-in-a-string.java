class Solution {
    public int strStr(String haystack, String needle) {
    //     int hLen=haystack.length();
    //     int nLen=needle.length();
    //     for(int i=0;i<=hLen-nLen;i++){
    //         int j=0;
    //         while(j<needle.length() && haystack.charAt(i+j)==needle.charAt(j))
    //             j++;
    //         if(j==needle.length()){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }
    return haystack.indexOf(needle);
    }
}