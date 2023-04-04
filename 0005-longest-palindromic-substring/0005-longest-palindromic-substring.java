class Solution {

    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        String processed = preprocess(s);
        int n = processed.length();
        int[] lengths = new int[n];
        int center = 0, right = 0;
        for (int i = 1; i < n - 1; i++) {
            int mirror = 2 * center - i;
            if (right > i) {
                lengths[i] = Math.min(right - i, lengths[mirror]);
            }
            while (processed.charAt(i + lengths[i] + 1) == processed.charAt(i - lengths[i] - 1)) {
                lengths[i]++;
            }
            if (i + lengths[i] > right) {
                center = i;
                right = i + lengths[i];
            }
        }
        int maxLen = 0, centerIdx = 0;
        for (int i = 1; i < n - 1; i++) {
            if (lengths[i] > maxLen) {
                maxLen = lengths[i];
                centerIdx = i;
            }
        }
        return s.substring((centerIdx - maxLen) / 2, (centerIdx + maxLen) / 2);
    }

    private String preprocess(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append('^');
        for (int i = 0; i < s.length(); i++) {
            sb.append('#');
            sb.append(s.charAt(i));
        }
        sb.append("#$");
        return sb.toString();
    }
}
