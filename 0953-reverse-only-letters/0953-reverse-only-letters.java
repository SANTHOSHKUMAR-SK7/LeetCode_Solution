class Solution {
    public String reverseOnlyLetters(String s) {
        char[] arr=s.toCharArray();
        int Left=0;
        int Right=arr.length-1;
        while(Left<Right){
            while(Left < Right && !Character.isAlphabetic(arr[Left])){
                Left++;
            }
            while(Left<Right && !Character.isAlphabetic(arr[Right])){
                Right--;
            }
            char temp=arr[Left];
            arr[Left]=arr[Right];
            arr[Right]=temp;

            Left++;
            Right--;
        }
        return new String(arr);
    }
}