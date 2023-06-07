class Solution {
    int[] tDict = new int[256];
    int[] sDict = new int[256];
    char[] sa;

    public String minWindow(String s, String t) {
        sa = s.toCharArray();
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            tDict[c - 'A']++;
        }
        int minL = Integer.MAX_VALUE;
        String result = "";
        int start = 0;
        for (int end = 0; end < s.length(); end++) {
            sDict[sa[end] - 'A']++;
            if (!checkValid()) {
                continue;
            }
            while (checkValid()) {
                if (end - start + 1 < minL) {
                    minL = end - start + 1;
                    result = s.substring(start, end + 1);
                }
                sDict[sa[start] - 'A']--;
                start++;
            }
        }
        return result;
    }

    private boolean checkValid() {
        for (int i = 0; i < tDict.length; i++) {
            if (tDict[i] > 0 && sDict[i] < tDict[i]) {
                return false;
            }
        }
        return true;
    }
}
