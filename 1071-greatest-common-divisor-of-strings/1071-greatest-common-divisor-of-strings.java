class Solution {

    public String gcdOfStrings(String str1, String str2) {
        int size = Math.min(str1.length(), str2.length());
        for (int i = size; i >= 1; i--) {
            if (isDivisor(i, str1, str2)) {
                return str2.substring(0, i);
            }
        }
        return "";
    }

    private boolean isDivisor(int len, String str1, String str2) {
        int l1 = str1.length();
        int l2 = str2.length();
        if (l1 % len > 0 || l2 % len > 0) {
            return false;
        }
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        String s = str1.substring(0, len);
        for (int i = 0; i < l1; i += len) {
            sb1.append(s);
        }
        for (int i = 0; i < l2; i += len) {
            sb2.append(s);
        }
        return sb1.toString().equals(str1) && sb2.toString().equals(str2);
    }
}
