class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]","");
        int left = 0;
        int right = str.length() - 1;
        String str1 = str.toLowerCase();
        while(left < right) {
            if(str1.charAt(left) != str1.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}