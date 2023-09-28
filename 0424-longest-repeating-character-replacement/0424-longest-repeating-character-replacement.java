class Solution {

    public int characterReplacement(String s, int k) {
        int result = 0;
        int[] freq = new int[26];
        int left = 0;
        int maxFreq = 0;
        for(int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            freq[c - 'A']++;
            maxFreq = Math.max(maxFreq, freq[c - 'A']);
            int wSize = right - left + 1;

            if (wSize - maxFreq > k) {
                char leftCh = s.charAt(left);
                freq[leftCh - 'A']--;
                left++;
            }
            wSize = right - left + 1;
            result = Math.max(result, wSize);
        }
        return result;
    }
}
