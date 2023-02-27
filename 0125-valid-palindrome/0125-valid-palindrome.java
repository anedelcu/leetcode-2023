class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()) {
            if(Character.isLetter(ch) || Character.isDigit(ch)) {
                sb.append(Character.toLowerCase(ch));
            }
        }
        System.out.println(sb.toString());
        return isPalindromeS(sb.toString());
    }
    
    public boolean isPalindromeS(String s) {
        int left = 0;
        int right = s.length() - 1;
        while(left < right) {
            if(s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}