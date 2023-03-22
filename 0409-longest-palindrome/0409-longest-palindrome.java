class Solution {
    public int longestPalindrome(String s) {
        int[] count = new int[128];
        int result = 0;
        for(char c : s.toCharArray()) {
            count[c]++;
        }
        for(int num : count) {
            result += num / 2 * 2;
            if(result % 2 == 0 && num % 2 == 1) {
                result++;
            }
        }
        return result;
    }
}