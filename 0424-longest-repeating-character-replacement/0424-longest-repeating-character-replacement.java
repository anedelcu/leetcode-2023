class Solution {

    public int characterReplacement(String s, int k) {
        int result = 0;
        int[] freq = new int[26];
        int left = 0;
        int right = 0;
        int maxFreq = 0;
        while(right < s.length()) {
            char c = s.charAt(right);
            freq[c - 'A']++;
            maxFreq = Math.max(maxFreq, freq[c - 'A']);
            int windowSize = right - left + 1;
            if(windowSize - maxFreq > k ) { // window is not valid
                char leftChar = s.charAt(left);
                freq[leftChar - 'A']--;
                left++;
                windowSize--;
            }
            result = Math.max(result, windowSize);
            right++;
        }
        return result;
    }
}
