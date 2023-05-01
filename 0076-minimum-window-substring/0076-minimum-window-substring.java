class Solution {

    public String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0) {
            return "";
        }
        Map<Character, Integer> tMap = new HashMap<>();
        for (char c : t.toCharArray()) {
            tMap.put(c, tMap.getOrDefault(c, 0) + 1);
        }
        int start = 0;
        int end = 0;
        int minLen = Integer.MAX_VALUE;
        int count = t.length();
        int minStart = 0;
        Map<Character, Integer> sMap = new HashMap<>();
        while (end < s.length()) {
            char endChar = s.charAt(end);
            sMap.put(endChar, sMap.getOrDefault(endChar, 0) + 1);
            if (tMap.containsKey(endChar) && sMap.get(endChar) <= tMap.get(endChar)) {
                count--;
            }

            while (count == 0) {
                if (end - start < minLen) {
                    minLen = end - start;
                    minStart = start;
                }
                char startChar = s.charAt(start++);
                if (tMap.containsKey(startChar) && sMap.get(startChar) <= tMap.get(startChar)) {
                    count++;
                }
                sMap.put(startChar, sMap.getOrDefault(startChar, 0) - 1);
            }
            end++;
        }
        if (minLen == Integer.MAX_VALUE) {
            return "";
        }
        return s.substring(minStart, minStart + minLen + 1);
    }
}
