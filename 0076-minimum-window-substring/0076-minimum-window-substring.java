class Solution {
    public String minWindow(String s, String t) {
        Map<Character, Integer> tFreq = new HashMap<>();
        for (char c : t.toCharArray()) {
            tFreq.put(c, tFreq.getOrDefault(c, 0) + 1);
        }
        int left = 0, right = 0, count = t.length();
        int minLen = Integer.MAX_VALUE, minStart = 0;
        Map<Character, Integer> sFreq = new HashMap<>();
        while (right < s.length()) {
            char c = s.charAt(right++);
            sFreq.put(c, sFreq.getOrDefault(c, 0) + 1);
            if (tFreq.containsKey(c) && sFreq.get(c) <= tFreq.get(c)) {
                count--;
            }
            while (count == 0) {
                if (right - left < minLen) {
                    minLen = right - left;
                    minStart = left;
                }
                char d = s.charAt(left++);
                if (tFreq.containsKey(d) && sFreq.get(d) <= tFreq.get(d)) {
                    count++;
                }
                sFreq.put(d, sFreq.getOrDefault(d, 0) - 1);
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
    }
}