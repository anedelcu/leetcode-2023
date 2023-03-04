// Runtime: 3 ms, faster than 94.17% of Java online submissions for Isomorphic Strings.
// Memory Usage: 42.1 MB, less than 95.61% of Java online submissions for Isomorphic Strings.
// Time Complexity : O(n)
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        Set<Character> usedChars = new HashSet<>();
        for(int i = 0; i < s.length(); i++) {
            Character ch1 = s.charAt(i);
            Character ch2 = t.charAt(i);
            if(!map.containsKey(ch1)){
                if(usedChars.contains(ch2)) {
                    return false;
                }
                map.put(ch1, ch2);
                usedChars.add(ch2);
            } 
            else if(map.get(ch1) != ch2) {
                return false;
            }
        }
        return true;
        
    }
}