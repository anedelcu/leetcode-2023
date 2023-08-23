class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]","");
        int left = 0;
        int right = str.length() - 1;
        
        while(left < right) {
            char c1 = Character.toLowerCase(str.charAt(left));
            char c2 = Character.toLowerCase(str.charAt(right));
            if(c1 != c2) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}