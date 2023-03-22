class Solution {

    public int longestPalindrome(String s) {
        int[] count = new int[128];
        int result = 0;
        for (char c : s.toCharArray()) {
            count[c]++;
        }
        for (int num : count) {
            if (num > 1 && num % 2 == 0) {
                result += num;
            } else if (num > 1 && num % 2 == 1) {
                result += num - 1;
            }
        }
        return s.length() == result ? result : result + 1;
    }
}
