class Solution {
    public String[] findWords(String[] words) {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        List<String> result = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            String lowerWord = words[i].toLowerCase();
            if (isInSingleRow(lowerWord, row1) || isInSingleRow(lowerWord, row2) || isInSingleRow(lowerWord, row3)) {
                result.add(words[i]);
            }
        }
        return result.toArray(new String[0]);
    }

     boolean isInSingleRow(String word, String row) {
        for (int i = 0; i < word.length(); i++) {
            if (!row.contains(String.valueOf(word.charAt(i)))) {
                return false;
            }
        }
        return true;
    }
}
