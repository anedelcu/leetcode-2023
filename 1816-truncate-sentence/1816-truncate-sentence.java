class Solution {
    public String truncateSentence(String s, int k) {
        String[] words = s.split(" ");
        if(k > words.length) {
            return s;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < k; i++) {
            sb.append(words[i]);
            if(i != k - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}