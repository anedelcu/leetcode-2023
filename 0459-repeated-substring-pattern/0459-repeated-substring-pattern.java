class Solution {

    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                String substr = s.substring(0, i);
                if (substr.repeat(n / i).equals(s)) {
                    return true;
                }
            }
        }
        return false;
    }
}
