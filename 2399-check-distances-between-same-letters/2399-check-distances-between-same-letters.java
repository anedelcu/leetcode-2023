class Solution {
    public boolean checkDistances(String s, int[] distance) {
        
        for(char c : s.toCharArray()) {
            int d = s.lastIndexOf(c) - s.indexOf(c) - 1;
            if(d != distance[c - 'a']) {
                return false;
            }
        }
        return true;
    }
}