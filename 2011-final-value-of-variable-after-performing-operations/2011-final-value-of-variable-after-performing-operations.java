class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int res = 0;
        for(String s : operations) {
            char c = s.charAt(1);
            if(c == '+') {
                res++;
            }
            else {
                res--;
            }
        }
        return res;
    }
}