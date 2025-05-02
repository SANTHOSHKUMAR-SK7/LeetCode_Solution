class Solution {
    public boolean checkIfPangram(String sentence) {
         sentence=sentence.toLowerCase();
         boolean[] pangram=new boolean[26];
         for(int i=0;i<sentence.length();i++){
            char c=sentence.charAt(i);
            if(c>='a' && c<='z'){
                pangram[c - 'a']=true;
            }
         }
         for(int i=0;i<26;i++){
            if(pangram[i]==false){
                return false;
            }
         }
         return true;
    }
}