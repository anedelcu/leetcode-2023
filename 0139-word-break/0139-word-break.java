class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet<>(wordDict);
        Boolean[] memo = new Boolean[s.length()]; // Use a memo array to store intermediate results
        return canBreak(s, 0, set, memo);
    }
    
    private boolean canBreak(String s, int start, Set<String> set, Boolean[] memo) {
        if (start == s.length()) {
            return true; // Base case: reached the end of s
        }
        if (memo[start] != null) {
            return memo[start]; // If the result is already computed, return it
        }
        for (int end = start + 1; end <= s.length(); end++) {
            if (set.contains(s.substring(start, end)) && canBreak(s, end, set, memo)) {
                memo[start] = true;
                return true;
            }
        }
        memo[start] = false;
        return false;
    }
}