class Solution {

    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s.toLowerCase().replaceAll("[^0-9a-zA-Z]", ""));
        System.out.println(sb.toString());
        int i = 0;
        int j = sb.length() - 1;
        while(i < j) {
            if(sb.charAt(i) != sb.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    
}
