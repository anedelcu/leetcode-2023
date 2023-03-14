class Solution {

    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int open = 0;
        int close = 0;
        int max = 0;
        for (close = 0; close < s.length(); close++) {
            char c = s.charAt(close);
            while (set.contains(c)) {
                set.remove(s.charAt(open));
                open++;
            }
            set.add(c);
            max = Math.max(max, set.size());
        }
        return max;
    }
}
