class Solution {
    public boolean checkInclusion( String pattern, String str) {
        if (pattern == null || str == null || pattern.length() > str.length()) {
            return false;
        }
        int[] count1 = new int[26];
        int[] count2 = new int[26];
        for (char c : pattern.toCharArray()) {
            count1[c - 'a']++;
        }
        for (int i = 0; i < str.length(); i++) {
            if (i >= pattern.length()) {
                count2[str.charAt(i - pattern.length()) - 'a']--;
            }
            count2[str.charAt(i) - 'a']++;
            if (Arrays.equals(count1, count2)) {
                return true;
            }
        }
        return false;
    }
}