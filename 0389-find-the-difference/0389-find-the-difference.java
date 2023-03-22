class Solution {
    public char findTheDifference(String s, String t) {
        int[] count = new int[26];
        for(char c : t.toCharArray()) {
            count[c - 'a']++;
        }
        for(char c : s.toCharArray()) {
            count[c - 'a']--;
        }
        for(int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if(count[c - 'a'] != 0) {
                return c;
            }
        }
        return 'a';
    }
}