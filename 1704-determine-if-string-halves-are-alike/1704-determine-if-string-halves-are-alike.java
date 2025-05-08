class Solution {
    public boolean halvesAreAlike(String s) {
      s=s.toLowerCase();
      int len=s.length();
      int Fcount=0;
      int Scount=0;
      for(int i=0;i<len/2;i++){
        if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
            Fcount++;
        }
      }
      for(int i=len/2;i<len;i++){
        if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
            Scount++;
        }
      }
      return Fcount==Scount;
    }
}