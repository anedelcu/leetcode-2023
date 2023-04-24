class Solution {
    public String mergeAlternately(String word1, String word2) {
        int min = Math.min(word1.length(), word2.length());
        int max = Math.max(word1.length(), word2.length());
        char[] res = new char[max + min];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < min && j < min) {
            res[k] = word1.charAt(i);
            k++;
            res[k] = word2.charAt(j);
            k++;
            i++;
            j++;
        }
        while(i < word1.length()) {
            res[k] = word1.charAt(i);
            k++;
            i++;
        }
        while(j < word2.length()) {
            res[k] = word2.charAt(j);
            k++;
            j++;
        }
        return String.valueOf(res);
        
        
    }
}