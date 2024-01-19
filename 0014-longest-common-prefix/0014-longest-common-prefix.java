class Solution {
    public String longestCommonPrefix(String[] strs) {
        int minLen = 200;
        for(String s : strs) {
            minLen = Math.min(s.length(), minLen);
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < minLen; i++) {
            char c1 = strs[0].charAt(i);
            for(int j = 1; j < strs.length; j++) {
                char cn = strs[j].charAt(i);
                if(c1 != cn) {
                    return sb.toString();
                }
            }
            sb.append(c1);
            
        }
        return sb.toString();
    }
}