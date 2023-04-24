class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < 26; i++) {
            char c = (char)('a' + i);
            set.add(c);
            if(sentence.indexOf(c) == -1) {
                return false;
            }
        }
        
        return true;
        
    }
}