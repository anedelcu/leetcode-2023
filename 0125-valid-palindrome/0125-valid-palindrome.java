class Solution {

    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            char cLeft = s.charAt(i);
            char cRight = s.charAt(j);
            if (!Character.isLetterOrDigit(cLeft)) {
                i++;
                continue;
            }

            if (!Character.isLetterOrDigit(cRight)) {
                j--;
                continue;
            }

            if (Character.toLowerCase(cLeft) != Character.toLowerCase(cRight)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
