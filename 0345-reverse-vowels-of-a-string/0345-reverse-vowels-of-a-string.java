class Solution {
    public String reverseVowels(String s) {
         char[] arr =s.toCharArray();
         int left=0;
         int right=s.length()-1;
         while(left<right){
            while(left<right && !Vol(arr[left])){
                left++;
            }
            while(left<right && !Vol(arr[right])){
                right--;
            }
            char temp=arr[right];
            arr[right]=arr[left];
            arr[left]=temp;
            left++;
            right--;
         }
         return new String(arr);


    }

    public boolean Vol(char c){
        return c =='a'||c=='A'||c =='e'||c=='E'||c =='i'||c=='I'||c =='o'||c=='O'||c =='u'||c=='U';
            }
    
}