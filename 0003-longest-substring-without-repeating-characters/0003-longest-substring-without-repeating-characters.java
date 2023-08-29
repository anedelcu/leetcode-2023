class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0;
        int right = 0;
        int result = 0;
        for(right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);
            while(set.contains(rightChar)) {
                char leftChar = s.charAt(left);
                set.remove(leftChar);
                left++;
            }
            set.add(rightChar);
            result = Math.max(result, set.size());
        }
        return result;
    }
}