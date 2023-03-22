class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        for(char c : magazine.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for(char c : ransomNote.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) - 1);
        }
        for(int val : map.values()) {
            if(val < 0) {
                return false;
            }
        }
        return true;
        
    }
}