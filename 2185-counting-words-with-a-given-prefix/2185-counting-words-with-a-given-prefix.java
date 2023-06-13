class Solution {
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        for(String word : words) {
            if(isPrefix(word, pref)) {
                count++;
            }
        }
        return count;
        
    }
    
    private boolean isPrefix(String word, String prefix) {
        if(prefix.length() > word.length()) {
            return false;
        }
        for(int i = 0; i < prefix.length(); i++) {
            if(prefix.charAt(i) != word.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}