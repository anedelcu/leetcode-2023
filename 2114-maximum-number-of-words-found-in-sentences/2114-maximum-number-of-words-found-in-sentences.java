class Solution {
    public int mostWordsFound(String[] sentences) {
        int res = 0;
        for(String s : sentences) {
            
            String [] sentence = s.trim().split("\\s+");
            res = Math.max(res, sentence.length);
        }
        return res;
    }
}