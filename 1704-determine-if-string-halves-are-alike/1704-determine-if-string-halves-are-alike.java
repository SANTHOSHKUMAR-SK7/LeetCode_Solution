class Solution {
    public boolean halvesAreAlike(String s) {
        int len = s.length();
        return CountVowel(s,0,len/2)==CountVowel(s,len/2,len);
    }

    public int CountVowel(String s, int start, int last) {
        int count=0;
        for (int i = start; i < last; i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u'|| s.charAt(i) == 'A'|| s.charAt(i) == 'E'|| s.charAt(i) == 'I'|| s.charAt(i) == 'O'|| s.charAt(i) == 'U') {
                count++;
            }
        }
        return count;
    }
}
