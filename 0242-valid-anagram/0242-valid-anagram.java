class Solution {

    public boolean isAnagram(String s, String t) {
        int[] chars = new int[26];

        for (char c : s.toCharArray()) {
            chars[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            chars[c - 'a']--;
        }
        for (int n : chars) {
            if (n != 0) {
                return false;
            }
        }
        return true;
    }
}
